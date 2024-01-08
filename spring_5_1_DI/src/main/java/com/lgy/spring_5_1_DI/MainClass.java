package com.lgy.spring_5_1_DI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx =new GenericXmlApplicationContext(configLoc);
		StudentInfo studentInfo = ctx.getBean("studentInfo",StudentInfo.class);
		//studentInfo.getStudentInfo();
		
		Student student2 = ctx.getBean("student2",Student.class);
		// studentInfo는 원래 빈 설정에 생성자로 student1 객체를 넣었으나, 필드 객체에 student2로 바꿈
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();
		ctx.close();
		
		
	}
}
