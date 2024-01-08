package com.lgy.spring_8_2_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX.xml");
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		AdminConnection connection = ctx.getBean("adminConnection",AdminConnection.class);
//		System.out.println(connection.getAdminId());
//		System.out.println(connection.getAdminPw());
//		System.out.println(connection.getSub_adminId());
//		System.out.println(connection.getSub_adminPw());
		DbConnection db =ctx.getBean("dbConnection",DbConnection.class);
		System.out.println(db.getMssqlId());
		System.out.println(db.getMssqlPw());
		System.out.println(db.getMysqlId());
		System.out.println(db.getMysqlPw());
		
		
		
	}
}
