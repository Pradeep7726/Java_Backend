package com.infinte.beantest;

import java.util.Date;

import com.infinite.beans.User;


public class BeanTest {
	public static void main(String[] args)
	{
		User prdp=new User();
		prdp.setUsername("Pradeep");
		prdp.setPassword("Pra");
		prdp.setLogindate(new Date());
		prdp.display();
		System.out.println(prdp.getUsername());
	}

}
