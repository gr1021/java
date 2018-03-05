package com.itheima_02;
/*
 * 学生类的测试类
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建对象
		Student  s = new Student();
		
		System.out.println(s.getName()+"-------"+s.getAge());
		
		s.setName("张三");
		s.setAge(18);
		
		System.out.println(s.getName()+"-------"+s.getAge());
	}
}
