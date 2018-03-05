package com.itheima_01;

public class StudentDemo {
	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
		Student s1 = new Student("张三",29);
		Student s2 = new Student("李四",23);
		Student s3 = new Student("王五",26);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for (int i = 0; i < students.length; i++) {
			Student s = students[i];
			System.out.println(s);
			//System.out.println(s.getName()+"---"+s.getAge());
		}
		
		
	}
}
