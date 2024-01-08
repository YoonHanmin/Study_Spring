package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainWon {
	public static void main(String[] args) {
		
	String config = "classpath:Circle.xml";
	AbstractApplicationContext atx = new GenericXmlApplicationContext(config);
	MyWon2Dollar myWon2Dollar = atx.getBean("myWon2Dollar",MyWon2Dollar.class);
	myWon2Dollar.exch();
	}
}
