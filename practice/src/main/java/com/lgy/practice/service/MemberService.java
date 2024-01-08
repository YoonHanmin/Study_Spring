package com.lgy.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.practice.dto.MemberDto;
import com.lgy.practice.repository.MemberRepository;

@Service
public class MemberService {
	
 private MemberRepository memberRepository;
	
	
	
	@Autowired
	public MemberService(MemberRepository memberRepository) {
	
	this.memberRepository = memberRepository;
}




	public int regist(MemberDto dto) {
		return memberRepository.insertMember(dto);
	}

	
}
