package com.itheima_01;
/*
 * 学生类的测试类
 */
public class StudentDemo {
	public static void main(String[] args) {
		
		//创建对象
		Student s = new Student();
		
		System.out.println(s.name+"-----"+s.age);
		
		//给成员变量赋值
		s.name = "张三";
		s.age = 18;
		
		System.out.println(s.name+"-----"+s.age);
		
		s.study();
		s.eat();
	}
}
