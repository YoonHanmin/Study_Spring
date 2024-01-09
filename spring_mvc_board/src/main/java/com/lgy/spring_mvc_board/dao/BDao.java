package com.lgy.spring_mvc_board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.lgy.spring_mvc_board.dto.BDto;

//DB SQL 처리
public class BDao {
	DataSource dataSource;
	
	public BDao() {
//		dbcp 방식으로 oracle 연결
		try {
				Context ctx = new InitialContext();
//				dataSource : 조회,저장,수정,삭제 쿼리에 모두 사용가능
				dataSource =(DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
				
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	게시판 목록 조회
	public ArrayList<BDto> list(){
		ArrayList<BDto> list = new ArrayList<BDto>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			connection =dataSource.getConnection();
			String sql = "select bid,bname,btitle,bcontent,bdate,bhit from mvc_board";
			pstmt = connection.prepareStatement(sql);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				int bid = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("bname");
				String bcontent = rs.getString("bname");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
//				하나의 게시글 객체
				BDto bDto = new BDto(bid,bname,btitle,bcontent,bdate,bhit);
				list.add(bDto);	
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return list;

	}
	
	public void write(String bname,String btitle,String bcontent) {

		Connection connection = null;
		PreparedStatement pstmt = null;
		
		try {
			connection =dataSource.getConnection();
			String sql = "insert into mvc_board(bid,bname,btitle,bcontent,bhit)"
					+ " values(mvc_board_seq.nextval,?,?,?,0)";
			
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, bname);;
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(pstmt!=null) pstmt.close();
				if(connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
	
//	게시글 하나를 리턴하기 위해서 BDto 사용(strID: 글번호)
	public BDto contentView(String strID) {
		// 게시글 조회수 올리기
		
		BDto dto = null;
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			connection =dataSource.getConnection();
			String sql = "select bid,bname,btitle,bcontent,bdate,bhit from mvc_board where bid=?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(strID));
			rs= pstmt.executeQuery();
			if(rs.next()) {
				int bid = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("bname");
				String bcontent = rs.getString("bname");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
//				하나의 게시글 객체
				dto = new BDto(bid,bname,btitle,bcontent,bdate,bhit);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dto;

	
	}
	
	
	
}
