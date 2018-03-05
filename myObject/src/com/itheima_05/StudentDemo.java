package com.itheima_05;

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();//姓名：null,年龄:0
		
		Student s2 = new Student("张三");
		s2.show();//姓名：张三,年龄:0
		
		Student s3 = new Student(28);
		s3.show();//姓名：null,年龄:28
		
		Student s4 = new Student("张三",28);
		s4.show();//姓名：张三,年龄:28
	}
	
	
}
