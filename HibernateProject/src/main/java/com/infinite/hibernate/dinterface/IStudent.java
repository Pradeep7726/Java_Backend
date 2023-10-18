package com.infinite.hibernate.dinterface;

import java.util.List;

import com.infinite.hibernate.pojo.Student;

public interface IStudent {

	public void createRecord(String name,String rno,String course);
	public List<Student> displayRecord();
	//public void deleteAllRecord();

}