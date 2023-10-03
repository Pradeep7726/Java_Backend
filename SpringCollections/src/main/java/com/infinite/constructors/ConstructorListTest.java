package com.infinite.constructors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//it is a abstract class              //it is implementing the abstract class
		ConstructorList customer = (ConstructorList) context.getBean("cmap11");
		System.out.println(customer.display());
		context.registerShutdownHook();
	}

}
