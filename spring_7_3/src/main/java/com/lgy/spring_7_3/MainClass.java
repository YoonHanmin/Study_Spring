package com.lgy.spring_7_3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("classpath:applicationCTX.xml");
//	스프링 설정 xml 파일 로딩
	
	Student student1 = ctx.getBean("student",Student.class);
	System.out.println(student1.getName());
	System.out.println(student1.getAge());
	Student student2 = ctx.getBean("student",Student.class);
	student2.setName("고유정");
	student2.setAge(25);
	System.out.println("==================");
	System.out.println(student2.getName());
	System.out.println(student2.getAge());
	System.out.println("==================");
	System.out.println(student1.getName());
	System.out.println(student1.getAge());
	
	if(student1.equals(student2)) {
		System.out.println("equal");
	}
	
	
	ctx.close();
}
}
