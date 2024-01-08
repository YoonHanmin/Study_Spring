package com.lgy.spring_6_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configLoc1 = "classpath:applicationCTX1.xml";
		String configLoc3 = "classpath:applicationCTX3.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc1,configLoc3);
		// student1 객체정보 가져옴
		Student student1 = ctx.getBean("student1",Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());
		
		StudentInfo studentInfo = ctx.getBean("studentInfo1",StudentInfo.class);
		// xml설정에서 student1 객체를 참조하고있음
		Student student2 = studentInfo.getStudent();
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
		}else {
			
			System.out.println("student1 != student2");
		}
//		student1과 같음
		System.out.println(student2.getName());
		System.out.println(student2.getHobbys());
		
//		configLoc3에 설정된 객체 참조
		Student student3 = ctx.getBean("student3",Student.class);
		System.out.println(student3.getName());
		System.out.println(student3.getHobbys());
		
		if(student1.equals(student3)) {
			System.out.println("student1 == student3");
		}else {
			
			System.out.println("student1 != student3");
		}
		
		Family family = ctx.getBean("family",Family.class);
		System.out.print(family.getPapaName());
		System.out.print(family.getMamaName());
		System.out.print(family.getStsterName());
		System.out.print(family.getBrotherName());
		
		ctx.close();
	}
	
}
