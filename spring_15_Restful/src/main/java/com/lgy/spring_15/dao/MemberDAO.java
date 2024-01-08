package com.lgy.spring_15.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.lgy.spring_15.domain.MemberDTO;

@Service
public class MemberDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MemberDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
    public MemberDTO findByName(String name) {
    	String sql = "select * from member where name=?";
    	return (MemberDTO) jdbcTemplate.queryForObject(sql,(rs,count)->
    	new MemberDTO(rs.getString("id"),rs.getString("name"),rs.getString("age"))
    	,name);
    	
    }
	
    public int join(MemberDTO memberDTO) {
    	String sql = "insert into member(id,name,age) values(?,?,?)";
    	return jdbcTemplate.update(sql,memberDTO.getId(),memberDTO.getName(),memberDTO.getAge());		
    }
}
