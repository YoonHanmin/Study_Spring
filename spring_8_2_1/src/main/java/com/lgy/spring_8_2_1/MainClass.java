package com.lgy.spring_8_2_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX.xml");
		AdminConnection connection = ctx.getBean("adminConnection",AdminConnection.class);
		System.out.println(connection.getAdminId());
		System.out.println(connection.getAdminPw());
		
	}
}
