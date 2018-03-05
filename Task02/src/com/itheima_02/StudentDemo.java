package com.itheima_02;

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setAge(20);
		s.setName("张三");
		
		System.out.println("姓名："+s.getName()+",年龄："+s.getAge());
	}
}
