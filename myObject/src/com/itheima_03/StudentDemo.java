package com.itheima_03;

public class StudentDemo {
	public static void main(String[] args) {
		//��������
		Student s = new Student();
		
		System.out.println("������"+s.getName()+",���䣺"+s.getAge());
		s.setName("����");
		s.setAge(28);
		
		System.out.println("������"+s.getName()+",���䣺"+s.getAge());
	}
}
