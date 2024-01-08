package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCircle {
	public static void main(String[] args) {
		// classpath 로 xml 객체 정보를 읽어서 configLoc 변수에 저장
		String configLoc = "classpath:Circle.xml";
//		제네릭Xml 객체 클래스로 객체 정보(configLoc에 담음)를 파싱(해석)해서
//		Abstract~ 클래스타입의 ctx 참조변수로 업캐스팅해서 받는다.
		AbstractApplicationContext atx =new GenericXmlApplicationContext(configLoc);
		MyCircle myCircle = atx.getBean("myCircle",MyCircle.class);
		myCircle.ar();
		
		
	}
}
