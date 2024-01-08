package com.lgy.spring_9_1;

import org.aspectj.lang.ProceedingJoinPoint;

//공통기능 클래스(Aspect)
public class LogAop {
//	loggerAop : advice(핵심기능 자체 - 메소드)
//	joinPoint : 핵심기능(공통기능이 적용되는 대상-메소드)
	public Object loggerAop(ProceedingJoinPoint joinPoint) { // loggerAOP : 경과시간 체크 공통기능 자체 (advice)
		String signatureStr =joinPoint.getSignature().toShortString(); // 핵심기능 클래스의 메소드 정보를 가지고옴
//		핵심기능이 start 되었다.
		System.out.println(signatureStr+"is start");
		long starttime = System.currentTimeMillis();
		Object obj=null;
		
//		핵심기능 실행
		try {
			obj = joinPoint.proceed(); //예외처리 추가
		} catch (Throwable e) {
			
			e.printStackTrace();
		}finally {
			long endtime = System.currentTimeMillis();
			System.out.println(signatureStr+"is finished");
			System.out.println(signatureStr+"의 경과시간 :"+(endtime-starttime));
			
		}
		return obj; //핵심기능 반환
	}
}
