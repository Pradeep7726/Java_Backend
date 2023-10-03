package com.infinite.constructors;

import java.util.Map;

public class ConstructorInjectionMap {
	private Map<String, String> p;

	ConstructorInjectionMap()
		{
			
		}
	ConstructorInjectionMap(Map<String, String> t)
		{
			p=t;
		}

	public Map<String, String> displayName() {
		//System.out.println(p.keySet());
		return p;
	}

}
