package com.itheima_05;

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();//������null,����:0
		
		Student s2 = new Student("����");
		s2.show();//����������,����:0
		
		Student s3 = new Student(28);
		s3.show();//������null,����:28
		
		Student s4 = new Student("����",28);
		s4.show();//����������,����:28
	}
	
	
}
