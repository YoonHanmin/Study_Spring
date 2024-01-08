package com.lgy.spring_6_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext : 어노테이션으로 객체정보를 가져옴
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		 AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		
		Student student1 = ctx.getBean("student1",Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getHobbys());
		System.out.println(student1.getHeight());
		System.out.println(student1.getWeight());
		
		Student student2 = ctx.getBean("student2",Student.class);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobbys());
		System.out.println(student2.getHeight());
		System.out.println(student2.getWeight());
		
	}
	
	
}
