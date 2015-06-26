package com.oneapm.fileTest;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String name ;
	private int age ;
	
	public Student(String name,int age)
	{
		super() ;
		this.name = name ;
		this.age = age ;
	}
	
	@Override
	public String toString()
	{
		return "[name:"+name +" age:" + age +"]";
		
	}

}
