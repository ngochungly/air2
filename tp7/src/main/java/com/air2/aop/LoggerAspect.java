package com.air2.aop;

//import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//import org.springframework.aop.MethodBeforeAdvice;

/*
 * public class LoggerAspect implements MethodBeforeAdvice {
 * 
 * public void before(Method method, Object[] args, Object target) throws
 * Throwable { System.out.println("Log: " + method.getName()); }
 * 
 * }
 */

@Aspect
public class LoggerAspect {

	  @Before("execution(* com.air2.aop.MonService.*(..))")
	  public void log(JoinPoint joinPoint) {
	    System.out.println("Log: " + joinPoint.getSignature().getName());
	  }
}