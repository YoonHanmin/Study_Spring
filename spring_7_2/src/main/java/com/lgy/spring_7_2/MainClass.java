package com.lgy.spring_7_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	
	GenericXmlApplicationContext ctx= new GenericXmlApplicationContext();
	ctx.load("classpath:applicationCTX.xml");
	ctx.refresh(); 
//	refresh 실행시 아래 오버라이딩한 메소드가 실행됨

//	@#@# 1. afterPropertiesSet() : 빈 생성시 호출
//	@#@  2. initMethod() : 빈 생성후 호출
//	@#$  3. destroyMethod() : 빈 소멸시 호출
//	@#@# 4. destroy() : 소멸후 호출
	ctx.close();
}
}
