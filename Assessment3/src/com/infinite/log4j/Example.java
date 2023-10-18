package com.infinite.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;




public class Example {
	private static final Logger logger = Logger.getLogger(Example.class);
	public static void display()
	{
		logger.info("Infinite Solutions");
		logger.info("Java Backend");
	}
	public static void main(String args[])
	{
		PropertyConfigurator.configure("log4j.properties");
		Example.display();
	}
}
