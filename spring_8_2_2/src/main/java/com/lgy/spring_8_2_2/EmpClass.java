package com.lgy.spring_8_2_2;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class EmpClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:oracle.properties"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		GenericXmlApplicationContext gtx = (GenericXmlApplicationContext) ctx;
		gtx.load("classpath:applicationCTX.xml");
		gtx.refresh();
		EmpConnection emp = gtx.getBean("empConnection",EmpConnection.class);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpPw());
		
		
	}
}
