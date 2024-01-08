package com.lgy.spring_9_1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop2 {
	
	private Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		String str = joinPoint.getSignature().toShortString();
		System.out.println("start=>"+str);
		
		try {
			Object obj = joinPoint.proceed();
			return obj;
			
		}finally {
			System.out.println("end =>"+ str);
		}
		
		
		
		
		
	}
}
