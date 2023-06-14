package com.fbs.StudentDemo.StudentApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="rollNumber")
	private int rollNumber;
	@Column(name="name")
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String name) {
		
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
