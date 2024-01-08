package com.lgy.practice.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.lgy.practice.dto.MemberDto;



@Mapper
@Repository
public interface MemberRepository {

	MemberDto getMemberById(int id);
	public int insertMember(MemberDto member);
	
}
