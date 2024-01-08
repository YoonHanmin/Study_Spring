package com.lgy.spring_8_1;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
	public static void main(String[] args) {
//		환경객체를 이용해서 설정을 가져오는 인터페이스
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
//		getPropertySources() 이용해서 프로퍼티 소스 객체 생성
		MutablePropertySources propertySources = env.getPropertySources();
		try {
//			addLast 메소드를 호출하여 ResourcePropertySource의 매개변수에 외부파일 path를 주입
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
			System.out.println("@#!#$"+env.getProperty("admin.id"));
			System.out.println("@#@#!"+env.getProperty("admin.pw"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//		다운캐스팅
		GenericXmlApplicationContext gctx = (GenericXmlApplicationContext) ctx;
		gctx.load("applicationCTX.xml");
		gctx.refresh();
//		객체 생성 전에 environment 객체를 받아서 저장, 객체생성이후 프로퍼티 값들 저장
		
		AdminConnection adminConnection = gctx.getBean("adminConnection",AdminConnection.class);
		System.out.println(adminConnection.getAdminId());
		System.out.println(adminConnection.getAdminPw());
		
	}
}
