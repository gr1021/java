package com.itheima_01;
/*
 * 学生类的测试类
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建对象
		Student s = new Student();
		
		System.out.println("姓名："+s.getName()+",年龄："+s.getAge());
		
		s.setName("张三");
		s.setAge(28);
		
		System.out.println("姓名："+s.getName()+",年龄："+s.getAge());
	}
}
