package com.infinite.collections;

import java.util.HashMap;
import java.util.List;
//program to check set in collections
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapBeanTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		// it is a abstract class //it is implementing the abstract class
		MapBean con = (MapBean) context.getBean("map");
		HashMap<String, String> hp = (HashMap) con.getMp();
		System.out.println(con.getMp());
		System.out.println(hp.keySet());
		System.out.println(hp.values());
		context.registerShutdownHook();
	}
}