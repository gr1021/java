package com.itheima_03;
/*
 * 学生类的测试类
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.show();
		
		Student s2 = new Student("张三");
		s2.show();
		
		Student s3 = new Student(28);
		s3.show();
		
		Student s4 = new Student("张三",28);
		s4.show();
		
	}
}
