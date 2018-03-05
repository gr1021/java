package com.itheima_03;

public class StudentDemo {
	public static void main(String[] args) {
		
		Student[] students = new Student[3]; 
		
		Student s1 = new Student("小李",24);
		Student s2 = new Student("小张",23);
		Student s3 = new Student("小王",27);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for (int i = 0; i < students.length; i++) {
			Student s = students[i];
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}
