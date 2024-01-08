package com.lgy.spring_10_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//공통기능 클래스(Aspect)
@Aspect
public class LogAop {
//	공통기능이 적용된 범위
	@Pointcut("within(com.lgy.spring_10_1.*)")
	private void pointCutMethod() {
		
		
	}
	
//	loggerAop : advice(핵심기능 자체 - 메소드)
//	joinPoint : 핵심기능(공통기능이 적용되는 대상-메소드)
	@Around("pointCutMethod()") //적용되는 메소드명, Around : 메소드 실행 전/후,예외처리 포함 공통기능 실행
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
