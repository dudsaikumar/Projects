package com.service.servicemanagement.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspect {
	private static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);
	@Before("execution(* com.service.servicemanagement.*.*.*(..))")
	public void beforemethod(JoinPoint jp) {
		String className=jp.getTarget().toString();
		String methodName=jp.getSignature().getName();
		LOGGER.info("Enter into the class "+className+"of method"+methodName);
		
		
	}
	
	@After(("execution(* com.service.servicemanagement.*.*.*(..))"))
	public void aftermethod(JoinPoint jp) {
		String className=jp.getTarget().toString();
		String methodName=jp.getSignature().getName();
		LOGGER.info("Exit from the class "+className+"of method"+methodName);

		
	}

}
