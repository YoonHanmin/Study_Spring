package com.lgy.spring_9_1;

import org.aspectj.lang.ProceedingJoinPoint;

// LogAop1 : 공통기능(클래스)
public class LogAop1 {

//	loggerAop() : 핵심기능(advice) 
	public Object loggerAop(ProceedingJoinPoint joinPoint) {
		String str = joinPoint.getSignature().toShortString();
//		"핵심기능이 실행되었다" 출력
		System.out.println(str+"is started");
//		핵심기능 실행시작 시간
		Long starttime = System.currentTimeMillis();
		Object obj=null;
		
		try {
//			핵심기능 실행
			obj = joinPoint.proceed();
		} catch (Throwable e) {
		
			e.printStackTrace();
		}
		finally {
//			핵심기능 종료시간
			long endtime = System.currentTimeMillis();
			System.out.println(str+"is finished");
			System.out.println(str+"경과 시간은 : "+ (endtime-starttime));
			
		}
		return obj;
	}
	
}
