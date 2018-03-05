package com.itheima_05;
/*
 * 构造方法： 方法名与类名相同   没有返回值类型  连void也没有   
 * 
 */
public class Student {
	private String name;
	private int age; 
		
	public Student(){
		
	}
	
	public Student(String name){
		this.name = name;
	}
	
	public Student(int age ){
		this.age = age;
	}
	
	public Student(String name , int age){
		this.name = name;
		this.age = age;
	}
	public void show(){
		System.out.println("姓名："+name+",年龄:"+age);
	}
}
