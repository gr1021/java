package com.itheima_03;

/*
 * 学生类
 */
public class Student {
	private String name;
	private int age;
	
	//构造方法
	public Student() {

	}

	public Student(String name) {
		this.name = name;
	}

	public Student(int age) {
		this.age = age;
	}
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void show(){
		System.out.println("姓名："+name+",年龄："+age);
	}
}
