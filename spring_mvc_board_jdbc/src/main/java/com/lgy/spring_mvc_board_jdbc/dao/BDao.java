package com.lgy.spring_mvc_board_jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.lgy.spring_mvc_board_jdbc.dto.BDto;
import com.lgy.spring_mvc_board_jdbc.util.Constant;



public class BDao {
	
	JdbcTemplate template=null;
	
	public BDao() {

//		try {
//				Context ctx = new InitialContext();
//				dataSource =(DataSource) ctx.lookup("java:comp/env/jdbc/oracle");		
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		기본 생성자로 Constant의 static template 객체를 주입 (constant.template는 컨트롤러로부터 주입받음)
		template = Constant.template;
	}
//	게시판 목록 조회
	public ArrayList<BDto> list(){
		ArrayList<BDto> list = null;
		String sql = "select bid,bname,btitle,bcontent,bdate,bhit from mvc_board";
//		query() : jdbc template 쿼리 처리함, RowMapper(BDto클래스)를 통해 쿼리결과값으로 날라온
//		ResultSet이 자동으로 BDto에 매핑됨
		list = (ArrayList<BDto>)template.query(sql, new BeanPropertyRowMapper(BDto.class));
		return list;
		
//		ArrayList<BDto> list = new ArrayList<BDto>();
//		Connection connection = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		try {
//			connection =dataSource.getConnection();
//			String sql = "select bid,bname,btitle,bcontent,bdate,bhit from mvc_board";
//			pstmt = connection.prepareStatement(sql);
//			rs= pstmt.executeQuery();
//			while(rs.next()) {
//				int bid = rs.getInt("bid");
//				String bname = rs.getString("bname");
//				String btitle = rs.getString("bname");
//				String bcontent = rs.getString("bname");
//				Timestamp bdate = rs.getTimestamp("bdate");
//				int bhit = rs.getInt("bhit");
////				하나의 게시글 객체
//				BDto bDto = new BDto(bid,bname,btitle,bcontent,bdate,bhit);
//				list.add(bDto);	
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(rs!=null) rs.close();
//				if(pstmt!=null) pstmt.close();
//				if(connection!=null) connection.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}

		

	}
	
	public void write(final String bname,final String btitle,final String bcontent) {
//		update(): jdbctemplate로 insert( PreparedStatementCreator 객체 사용) 
//		메소드 파라미터에 PreparedStatementCreator객체를 만들어 쿼리에 동적변수할당 (제이쿼리와 유사한 문법)
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into mvc_board(bid,bname,btitle,bcontent,bhit)"
						+ " values(mvc_board_seq.nextval,?,?,?,0)";
				PreparedStatement pstmt = con.prepareStatement(sql);
//				익명클래스에서 메소드의 파라미터 변수를 받기위해 파라미터 변수를 final로 선언해야함
				pstmt.setString(1, bname);
				pstmt.setString(2, btitle);
				pstmt.setString(3, bcontent);
				return pstmt;
			}
		});
		
		
//		Connection connection = null;
//		PreparedStatement pstmt = null;
//		
//		try {
//			connection =dataSource.getConnection();
//			String sql = "insert into mvc_board(bid,bname,btitle,bcontent,bhit)"
//					+ " values(mvc_board_seq.nextval,?,?,?,0)";
//			
//			pstmt = connection.prepareStatement(sql);
//			pstmt.setString(1, bname);
//			pstmt.setString(2, btitle);
//			pstmt.setString(3, bcontent);
//			pstmt.executeUpdate();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				
//				if(pstmt!=null) pstmt.close();
//				if(connection!=null) connection.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}

	}
	

	public BDto contentView(String strID) {
		upHit(strID);
		
		BDto dto = null;
		String sql = "select bid,bname,btitle,bcontent,bdate,bhit from mvc_board where bid="+strID;
//		dto = (BDto)template.query(sql, new BeanPropertyRowMapper(BDto.class));
		return (BDto)template.queryForObject(sql,new BeanPropertyRowMapper<BDto>(BDto.class));
		 
//		
//		BDto dto = null;
//		Connection connection = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		try {
//			connection =dataSource.getConnection();
//			String sql = "select bid,bname,btitle,bcontent,bdate,bhit from mvc_board where bid=?";
//			pstmt = connection.prepareStatement(sql);
//			pstmt.setInt(1, Integer.parseInt(strID));
//			rs= pstmt.executeQuery();
//			if(rs.next()) {
//				int bid = rs.getInt("bid");
//				String bname = rs.getString("bname");
//				String btitle = rs.getString("bname");
//				String bcontent = rs.getString("bname");
//				Timestamp bdate = rs.getTimestamp("bdate");
//				int bhit = rs.getInt("bhit");
//
//				dto = new BDto(bid,bname,btitle,bcontent,bdate,bhit);
//				
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(rs!=null) rs.close();
//				if(pstmt!=null) pstmt.close();
//				if(connection!=null) connection.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}

	}
	

	public void upHit(final String bid) {
		String sql = "update mvc_board set bhit=bhit+1 where bid=?";
		template.update(sql,new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1,Integer.parseInt(bid));
				
			}
			
		});
//		Connection connection = null;
//		PreparedStatement pstmt = null;
//		try {
//			connection =dataSource.getConnection();
//			String sql = "update mvc_board set bhit=bhit+1 where bid=?";
//			pstmt = connection.prepareStatement(sql);
//			pstmt.setInt(1,Integer.parseInt(bid));
//			pstmt.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(pstmt!=null) pstmt.close();
//				if(connection!=null) connection.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//
	}
//	게시글 수정
	public void modify(final String bid,final String bname,final String btitle,final String bcontent) {
		String sql = "update mvc_board set bname=?,btitle=?,bcontent=? where bid =?";
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bname);
				ps.setString(2, btitle);
				ps.setString(3, bcontent);
				ps.setInt(4,Integer.parseInt(bid));
			}
		});
//		Connection connection = null;
//		PreparedStatement pstmt = null;
//		try {
//			connection =dataSource.getConnection();
//			String sql = "update mvc_board set bname=?,btitle=?,bcontent=? where bid =?";
//			pstmt = connection.prepareStatement(sql);
//			pstmt.setString(1, bname);
//			pstmt.setString(2, btitle);
//			pstmt.setString(3, bcontent);			
//			pstmt.setInt(4,Integer.parseInt(bid));
//			
//			pstmt.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(pstmt!=null) pstmt.close();
//				if(connection!=null) connection.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}

	}
//	게시글 삭제
	public void delete(final String bid) {
		String sql = "delete from mvc_board where bid =?";
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1,Integer.parseInt(bid));
				
			}
		});
		
	}
//		Connection connection = null;
//		PreparedStatement pstmt = null;
//		try {
//			connection =dataSource.getConnection();
//			String sql = "delete from mvc_board where bid =?";
//			pstmt = connection.prepareStatement(sql);
//			pstmt.setInt(1,Integer.parseInt(bid));
//			pstmt.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(pstmt!=null) pstmt.close();
//				if(connection!=null) connection.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//
//	}
}
