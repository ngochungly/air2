package com.air2.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MonService service = (MonService) ctx.getBean("monService");
		service.method1();
		System.out.println("\n");
		service.method2();

	}

}
