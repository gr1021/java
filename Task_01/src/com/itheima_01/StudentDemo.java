package com.itheima_01;
/*
 * ѧ����Ĳ�����
 */
public class StudentDemo {
	public static void main(String[] args) {
		
		//��������
		Student s = new Student();
		
		System.out.println(s.name+"-----"+s.age);
		
		//����Ա������ֵ
		s.name = "����";
		s.age = 18;
		
		System.out.println(s.name+"-----"+s.age);
		
		s.study();
		s.eat();
	}
}
