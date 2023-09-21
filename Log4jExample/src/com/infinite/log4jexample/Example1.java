package com.infinite.log4jexample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example1 {
	
	private static final Logger logger = Logger.getLogger(Example1.class);
	{
		logger.info("unamed Block");
	}
	public static void display()
	{
		logger.info("Hii from display");
	}
	public void displaynonstatic()
	{
		try{
			int a=1/0;
		}
		catch (Exception e){
			logger.error("Display non static");
		}
	}
	public static void main(String args[])
	{
		/*PropertyConfigurator.configure("log4j.properties");
		logger.info("hi hello world");
		logger.warn("please dont use it");
		logger.error("help Error Occured");
		logger.fatal("Error occured");*/
		PropertyConfigurator.configure("log4j.properties");
		Example1.display();
		Example1 obj=new Example1();
		obj.displaynonstatic();
	}
}
