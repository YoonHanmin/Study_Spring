package com.lgy.practice;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.lgy.practice.dto.MemberDto;
import com.lgy.practice.service.MemberService;

@Component
public class Main {
	
	
	static MemberService memberService;
	@Autowired
	public Main(MemberService memberService) {
		this.memberService=memberService;
	}
	
	public static void main(String[] args) {
		MemberDto dto = new MemberDto();
		dto.setId(1);
		dto.setName("yoon");
		dto.setAge(22);
		memberService.regist(dto);
		
		
		
		
		
	}
	}
