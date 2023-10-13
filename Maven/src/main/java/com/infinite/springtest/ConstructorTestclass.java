package com.infinite.springtest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infinite.springcore.ConstructorsInjection;

public class ConstructorTestclass {
	public static void main(String[] args)
	{
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Sample1.xml");
		ConstructorsInjection customer=(ConstructorsInjection) context.getBean("const");
		System.out.println(customer.displayName());
		context.registerShutdownHook();
	}
}
