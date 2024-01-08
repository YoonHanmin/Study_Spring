package com.lgy.spring_8_3_1;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config="";
		Scanner scan = new Scanner(System.in);
		String str= scan.next();
		
		if(str.equals("dev")) { // 개발서버일때
			config="dev";
		}else if(str.equals("run")) { // 운영서버일때
			config="run";
		}
		
		scan.close();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config); // dev? run?
//		dev,run 값을 가지고 profile 속성을 찾아감
		ctx.load("applicationCTX_dev.xml","applicationCTX_run.xml");
		
		ServerInfo info = ctx.getBean("serverInfo",ServerInfo.class);
		System.out.println(info.getIpNum());
		System.out.println(info.getPortNum());
	}
}
