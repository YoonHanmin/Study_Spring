package com.lgy.spring_8_3_2;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainDriver {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources =env.getPropertySources();
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:jdbc_driver.properties"));
			GenericXmlApplicationContext gtx = (GenericXmlApplicationContext)ctx;
			gtx.load("classpath:applicationCTX.xml");
			gtx.refresh();
			JdbcDriver jdbc = gtx.getBean("jdbcDriver",JdbcDriver.class);
			System.out.println(jdbc.getMysql());
			System.out.println(jdbc.getOracle());
			
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
