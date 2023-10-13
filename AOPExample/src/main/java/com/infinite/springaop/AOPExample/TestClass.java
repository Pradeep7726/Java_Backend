package com.infinite.springaop.AOPExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				  new ClassPathXmlApplicationContext("applicationcontext.xml");

				//Get BusinessLogic bean object from ApplicationContext instance. 
		CommonClass businessLogic = 
				  (CommonClass) context.getBean("businessLogic");

				//Call implementBusinessLogic method of BusinessLogic bean.
				System.out.println(businessLogic.display());
	}

}
