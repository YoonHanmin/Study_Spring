package com.lgy.spring_3_2;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		해당 부분은 applicationCTX.xml에서 설정으로 처리했음
//		MyCalculator myCalculator = new MyCalculator();
//		// MyCalculator 객체의 필드인 Calulator 객체를 생성해서 넣어줬음.
//		myCalculator.setCalculator(new Calculator());
//		myCalculator.setFirstNum(10);
//		myCalculator.setSecondNum(2);
		
		// classpath 로 xml 객체 정보를 읽어서 configLoc 변수에 저장
		String configLoc = "classpath:applicationCTX.xml";
//		제네릭Xml 객체 클래스로 객체 정보(configLoc에 담음)를 파싱(해석)해서
//		Abstract~ 클래스타입의 ctx 참조변수로 업캐스팅해서 받는다.
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
//		getBean 메소드로 xml에 설정한 객체정보를 가져옴
		MyCalculator myCalculator = ctx.getBean("myCalculator",MyCalculator.class);
		MyCalculator myCalculator2 = ctx.getBean("myCalculator",MyCalculator.class);
		
		String config = "classpath:applicationCTX.xml";
		AbstractApplicationContext atx = new GenericXmlApplicationContext(config);
		MyThree myThree = atx.getBean("myThree",MyThree.class);
//		myThree.process();

		MyDiv myDiv = atx.getBean("myDiv",MyDiv.class);
		myDiv.pr();
		MyRect myRect = atx.getBean("myRect",MyRect.class);
		myRect.pr();
		MyMedian myMedian = atx.getBean("myMedian",MyMedian.class);
		myMedian.pr();
		MyEven myEven = atx.getBean("myEven",MyEven.class);
		myEven.pr();
		Mycap mycap = atx.getBean("mycap",Mycap.class);
		mycap.pr();
	}
	
}
