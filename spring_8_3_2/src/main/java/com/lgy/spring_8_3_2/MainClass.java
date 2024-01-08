package com.lgy.spring_8_3_2;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(str.equals("dev")) {
			config = "dev";
		}else if(str.equals("run")) {
			config = "run";
		}
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
//		register 메소드를 통해 dev,run중 profile설정된 클래스로 찾아감.
		ctx.register(ApplicationConfigDev.class,ApplicationConfigRun.class);
		ctx.refresh(); 
		
		ServerInfo info = ctx.getBean("serverInfo",ServerInfo.class);
		System.out.println(info.getIpNum());
		System.out.println(info.getPortNum());
		
		
	}
}
