

package com.educacionit.java.advanced.beans;


public class Student {
	
	
	private String name = "";
	private Integer age = 0;
	
	
	public Student () {
	
		super();
	}
	
	public Student (String name) {
		
		this (name, 0);
	}
	
	public Student (int age) {
		
		this ("", age);
	}
	
	public Student (String name, Integer age) {
		
		super();
		
		this.name = name;
		this.age = age;
	}

	
	public String getName () {
		
		return this.name;
	}

	public void setName (String name) {
	
		this.name = name;
	}

	public Integer getAge () {
	
		return this.age;
	}

	public void setAge (Integer age) {

		this.age = age;
	}
}