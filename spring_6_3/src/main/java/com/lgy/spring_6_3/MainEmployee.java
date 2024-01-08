package com.lgy.spring_6_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEmployee {
	public static void main(String[] args) {
		String loc = "classpath:applicationCTX.xml";
				String loc2 = "classpath:employeeCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(loc,loc2);
		
		Employee employee1 = ctx.getBean("employee1",Employee.class);
		
		System.out.println(employee1.getName());
		System.out.println(employee1.getPay());
		System.out.println(employee1.getCertification()
				);
		System.out.println("===================");
		EmplyeeInfo emplyeeInfo1 = ctx.getBean("emplyeeInfo1",EmplyeeInfo.class);
		Employee employee2 = emplyeeInfo1.getEmployee();
		System.out.println(employee2.getName());
		System.out.println(employee2.getPay());
		System.out.println(employee2.getCertification());
		System.out.println("===================");
Employee employee3 = ctx.getBean("employee3",Employee.class);
		
		System.out.println(employee3.getName());
		System.out.println(employee3.getPay());
		System.out.println(employee3.getCertification()
				);
		
		Professor professor1 = ctx.getBean("professor1",Professor.class);
		ProfessorInfo professorInfo = ctx.getBean("professorInfo",ProfessorInfo.class);
		System.out.println(professor1.getName());
		System.out.println(professor1.getAge());
		System.out.println(professor1.getDept());
		System.out.println("===================");
		Professor professor2 = professorInfo.getProfessor();
		System.out.println(professor2.getName());
		System.out.println(professor2.getAge());
		System.out.println(professor2.getDept());
		Professor professor3 = ctx.getBean("professor2",Professor.class);
		System.out.println(professor3.getName());
		System.out.println(professor3.getAge());
		System.out.println(professor3.getDept());
		
		Singer singer1 = ctx.getBean("singer1",Singer.class);
		SingerInfo singerInfo = ctx.getBean("singerInfo",SingerInfo.class);
		System.out.println(singer1.getName());
		System.out.println(singer1.getMember());
		System.out.println(singer1.getSong());
		System.out.println("===================");
		Singer singer2 = singerInfo.getSinger();
		System.out.println(singer2.getName());
		System.out.println(singer2.getMember());
		System.out.println(singer2.getSong());
		Singer singer3 = ctx.getBean("singer3",Singer.class);
		System.out.println(singer3.getName());
		System.out.println(singer3.getMember());
		System.out.println(singer3.getSong());
		
		
		Animation animation1 = ctx.getBean("animation1",Animation.class);
		AnimationInfo animationInfo = ctx.getBean("animationInfo",AnimationInfo.class);
		System.out.println(animation1.getName());
		System.out.println(animation1.getYear());
		System.out.println(animation1.getMember());
		System.out.println("===================");
		Animation animation2 = animationInfo.getAnimation();
		System.out.println(animation2.getName());
		System.out.println(animation2.getYear());
		System.out.println(animation2.getMember());
		System.out.println("===================");
		Animation animation3 = ctx.getBean("animation2",Animation.class);
		System.out.println(animation3.getName());
		System.out.println(animation3.getYear());
		System.out.println(animation3.getMember());
		System.out.println("===================");
	}
	
}
