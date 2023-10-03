package com.infinite.collections;
//program to check list in collections
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//it is a abstract class              //it is implementing the abstract class
		CollectionTest con = (CollectionTest) context.getBean("collectiontest");
		System.out.println(con.getLs());
		context.registerShutdownHook();
	}
}
