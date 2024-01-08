package com.lgy.spring_9_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainProf {
	public static void main(String[] args) {
			AbstractApplicationContext ctx = 
					new GenericXmlApplicationContext("classpath:ApplicationCTX1.xml");
			Professor pro = ctx.getBean("professor",Professor.class);
			pro.getProfessorInfo();
			
		
	}
}
