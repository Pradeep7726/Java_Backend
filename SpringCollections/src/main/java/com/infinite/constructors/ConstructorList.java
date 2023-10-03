package com.infinite.constructors;

import java.util.List;
public class ConstructorList {
	private List<String> l;
	ConstructorList(List<String> l){
		this.l=l;
	}
	public List<String> display()
	{
		return l;
	}

}
