package com.lgy.spring_8_3_2;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDB {
	public static void main(String[] args) {
		String config = "";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(str.equals("oracle")) {
			config = "oracle";
		}else if(str.equals("mysql")) {
			config = "mysql";
		}
		
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ctx.getEnvironment().setActiveProfiles(config);
//		register 메소드를 통해 dev,run중 profile설정된 클래스로 찾아감.
//		ctx.register(ApplicationConfigDev.class,ApplicationConfigRun.class);
//		ctx.refresh(); 
	
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//		setActiveProfiles : xml 파일을 profile속성을 이용해서 찾아갈때 사용
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("classpath:oracle.xml","classpath:mysql.xml");
		
		
		
		DbInfo info = ctx.getBean("dbinfo",DbInfo.class);
		System.out.println(info.getDriver());
		System.out.println(info.getUrl());
		System.out.println(info.getUser());
		System.out.println(info.getPassword());
		
		
	}
}
