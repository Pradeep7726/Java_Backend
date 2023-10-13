package com.infinite.springcore;

public class ConstructorsInjection {

	private String first;
	private String last;
	/*ConstructorsInjection()
	{
		
	}*/
	ConstructorsInjection(String firstname,String lastname)
	{
		first=firstname;
		last=lastname;
	}
	public String displayName()
	{
		return new String(first).concat(last).toUpperCase();
	}
}
