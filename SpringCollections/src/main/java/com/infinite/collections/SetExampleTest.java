package com.infinite.collections;

import java.util.List;
//program to check set in collections
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetExampleTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//it is a abstract class              //it is implementing the abstract class
		SetExample con = (SetExample) context.getBean("settest");
		System.out.println(con.getSt());
		context.registerShutdownHook();

}

}
