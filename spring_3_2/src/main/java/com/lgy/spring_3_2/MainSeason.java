package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainSeason {
	public static void main(String[] args) {
		String config = "classpath:Circle.xml";
		AbstractApplicationContext atx = new GenericXmlApplicationContext(config);
		MySeason mySeason = atx.getBean("mySeason",MySeason.class);
		mySeason.result();
	}
}
