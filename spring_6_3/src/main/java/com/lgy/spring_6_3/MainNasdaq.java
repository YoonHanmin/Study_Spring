package com.lgy.spring_6_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainNasdaq {
public static void main(String[] args) {
	String config= "classpath:nasdaqCTX.xml";
	String config2= "classpath:nasdaqCTX2.xml";
	AbstractApplicationContext ctx= new GenericXmlApplicationContext(config,config2);
	Nasdaq nasdaq1 = ctx.getBean("nasdaq1",Nasdaq.class);
	NasdaqInfo nasdaqInfo = ctx.getBean("nasdaqInfo",NasdaqInfo.class);
	System.out.println(nasdaq1.getStock());
	System.out.println(nasdaq1.getRank());
	System.out.println(nasdaq1.getProduct());
	System.out.println("=================");
	Nasdaq nasdaq2 = nasdaqInfo.getNasdaq();
	System.out.println(nasdaq2.getStock());
	System.out.println(nasdaq2.getRank());
	System.out.println(nasdaq2.getProduct());
	System.out.println("=================");
	Nasdaq nasdaq3 = ctx.getBean("nasdaq2",Nasdaq.class);
	System.out.println(nasdaq3.getStock());
	System.out.println(nasdaq3.getRank());
	System.out.println(nasdaq3.getProduct());
	
	
	
}
}
