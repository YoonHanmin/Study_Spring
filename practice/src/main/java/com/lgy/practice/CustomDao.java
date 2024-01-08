package com.lgy.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class CustomDao {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	Connection conn = null;
	
	public int insertData(CustomDto dto) {		
		int result = 0;			
		PreparedStatement pstmt = null;		
		String sql;				
		try {					
			conn = dataSource.getConnection();		
			sql = "insert into custom (id,name,age) values (?,?,?)";	
			pstmt = conn.prepareStatement(sql);				
			pstmt.setString(1, dto.getId());		
			pstmt.setString(2, dto.getName());		
			pstmt.setInt(3, dto.getAge());			
			result = pstmt.executeUpdate();			
			pstmt.close();				
			} catch (Exception e) {		
				System.out.println(e.toString());	
				}				return result;	
				}	
	//데이터 수정	
	public int updateData(CustomDto dto) {		
		int result = 0;			
		PreparedStatement pstmt = null;	
		String sql;		
		try {			
			conn = dataSource.getConnection();		
			sql = "update custom set name=?,age=? where id=?";		
			pstmt = conn.prepareStatement(sql);		
			pstmt.setString(1, dto.getName());	
			pstmt.setInt(2, dto.getAge());		
			pstmt.setString(3, dto.getId());	
			result = pstmt.executeUpdate();		
			pstmt.close();				
			} catch (Exception e) {		
				System.out.println(e.toString());
				}			
		return result;	
		}	
	//데이터 삭제	
	public int deleteData(String id) {
		int result = 0;			
		PreparedStatement pstmt = null;		
		String sql;			
		try {				
			conn = dataSource.getConnection();	
			sql = "delete custom where id=?";			
			pstmt = conn.prepareStatement(sql);				
			pstmt.setString(1, id);					
			result = pstmt.executeUpdate();			
			pstmt.close();				
			} catch (Exception e) {			
				System.out.println(e.toString());	
				}			
		return result;		
		}		
	//모든 데이터 출력	
	public List<CustomDto> getList(String id) {		
		List<CustomDto> lists = new ArrayList<CustomDto>();	
		PreparedStatement pstmt = null;		
		ResultSet rs = null;				
		String sql;			
		try {					
			conn = dataSource.getConnection(); 
			//DB연결자		
			sql = "select id,name,age from custom";		
			pstmt = conn.prepareStatement(sql);		
			pstmt.setString(1, id);				
			rs = pstmt.executeQuery();			
			while(rs.next()) {					
				CustomDto dto = new CustomDto();	
				dto.setId(rs.getString("id"));		
				dto.setName(rs.getString("name"));		
				dto.setAge(rs.getInt("age"));			
				lists.add(dto);						
				}						
			rs.close();		
			pstmt.close();			
			} catch (Exception e) {		
				System.out.println(e.toString());	
				}				return lists;	
				}		
	//하나의 데이터 출력	
	public CustomDto getReadData(String id) {		
		CustomDto dto = null;		
		PreparedStatement pstmt = null;	
		ResultSet rs = null;		
		String sql;		
		try {				
			conn = dataSource.getConnection(); 
			//DB연결자		
			sql = "select id,name,age from custom where id=?";		
			pstmt = conn.prepareStatement(sql);		
			rs = pstmt.executeQuery();			
			if(rs.next()) {						
				dto = new CustomDto();			
				dto.setId(rs.getString("id"));	
				dto.setName(rs.getString("name"));	
				dto.setAge(rs.getInt("age"));		
				}					
			rs.close();			
			pstmt.close();		
			} catch (Exception e) {		
				System.out.println(e.toString());
				}
		return dto;
		}

	}

	
	
	

