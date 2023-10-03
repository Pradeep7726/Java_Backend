package com.infinite.constructors;

import java.util.Map;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConstructorInjectionMapTest {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//it is a abstract class              //it is implementing the abstract class
		ConstructorInjectionMap customer = (ConstructorInjectionMap) context.getBean("cmap");
		System.out.println(customer.displayName());
		context.registerShutdownHook();
	}
}



