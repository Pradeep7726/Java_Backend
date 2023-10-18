package com.infinite.hibernate.pojo;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity//An entity represents a table stored in a database. Every instance of an entity represents a row in the table. 
@Table(name="Student")

public class Student {
	
	@Id
	@Column(name="student_id")
	@GeneratedValue(strategy=GenerationType.AUTO)//generationType.Auto as auto primary key geneartion stratergy.it will instruct hib to automatically generate a unique value for that field.
	private int id;

 

	@Column(name="student_name")
	private String studentName;

 

	@Column(name="roll_number")
	private String rollNumber;

 

	@Column(name="course")
	private String course;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getRollNumber() {
		return rollNumber;
	}



	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}
}
