package com.infinite.constructors;

import java.util.Set;

public class ConstructorSet {
	private Set<String> s;
	ConstructorSet(Set<String> s){
		this.s=s;
	}
	public Set<String> display()
	{
		return s;
	}

}
