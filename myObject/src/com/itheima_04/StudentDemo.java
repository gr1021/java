package com.itheima_04;

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("s   :"+s);
		s.setName("张三");
		s.setAge(28);
		
		System.out.println("姓名："+s.getName()+",年龄："+s.getAge());
		
	}
}
