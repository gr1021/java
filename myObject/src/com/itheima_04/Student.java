package com.itheima_04;

public class Student {
	private String name;
	private int age; 
		
	public void setName(String name){
		System.out.println("this:"+this);
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age ){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
}
