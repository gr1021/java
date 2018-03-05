package com.itheima_02;
/*
 * 学生类
 */
public class Student {
	//成员变量
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
		
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if (age < 0 || age > 150) {
			System.out.println("你输入的年龄不正确");
		}else{
		this.age = age;
		}
	}
	
}
