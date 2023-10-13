package com.infinite.springtest;
import java.util.Date;	 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infinite.springcore.Address;

public class DateExample {
	

	public static void main(String args[]){

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Sample.xml");

			Address customer=(Address)context.getBean("custAddress1");
			System.out.println(customer.getCity());
			System.out.println(customer.getName());
			System.out.println(new Date());
			context.registerShutdownHook();
		}
}
