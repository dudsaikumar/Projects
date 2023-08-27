package com.service.servicemanagement.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerformanceAspect {
	
	
		long startTime;

		final Logger LOGGER=LoggerFactory.getLogger(PerformanceAspect.class);
		@Before("execution(*com.service.servicemanagement.*.*.*(..))")
		public void beforeMethod() {
			long startTime;
			startTime=System.currentTimeMillis();
			
		}
		@After("execution(*com.service.servicemanagement.*.*.*(..))")
		public void afterMethod() {
			long endTime;
			endTime=System.currentTimeMillis();
			long Timetaken=endTime-startTime;
			LOGGER.info("time take to execute savepatient method as"+Timetaken);
			
		}
		@Around("execution(*com.service.servicemanagement.*.*.*(..))")
		public Object around(ProceedingJoinPoint pj) {
			long startTime;
		
		startTime=System.currentTimeMillis();
		Object obj=null;
		try {
			obj=pj.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		long endTime=System.currentTimeMillis();
		long timeTaken=endTime-startTime;
		String className=pj.getTarget().toString();
		String methodName=pj.getSignature().getName();
		
		LOGGER.info("time taken to execute the method"+methodName+"in the class"+className+"time taken"+timeTaken);
		
		
		
		
		
		
		return obj;
		
	}

}
