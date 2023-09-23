package com.infinite.security;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestSecurity {
	private static final Logger logger=Logger.getLogger(TestSecurity.class);
	public static void main(String[] args) {
		
		
		PropertyConfigurator.configure("log4j.properties");
		final String secretKey = "prdp123";
	String originalString = "mysql123@";
	String encryptedString = JavaSecurity.encrypt(originalString, secretKey) ;
	String decryptedString = JavaSecurity.decrypt(encryptedString, secretKey) ;



	logger.error(originalString);
	logger.error(encryptedString);
	logger.error(decryptedString);
	}
}