package com.lgy.spring_7_1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	GenericXmlApplicationContext ctx= new GenericXmlApplicationContext();
//	스프링 설정 xml 파일 로딩
	ctx.load("classpath:applicationCTX.xml");
	ctx.refresh(); //생략해도 객체 정보 출력에는 문제없음
	Student student = ctx.getBean("student",Student.class);
	System.out.println(student.getName());
	System.out.println(student.getAge());
	ctx.close();
}
}
