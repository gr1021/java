package com.itheima_02;
/*
 * ѧ����Ĳ�����
 */
public class StudentDemo {
	public static void main(String[] args) {
		//��������
		Student  s = new Student();
		
		System.out.println(s.getName()+"-------"+s.getAge());
		
		s.setName("����");
		s.setAge(18);
		
		System.out.println(s.getName()+"-------"+s.getAge());
	}
}
