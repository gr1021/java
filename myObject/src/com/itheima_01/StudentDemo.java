package com.itheima_01;

/*
 * Student��Ĳ�����
 */
public class StudentDemo {
	public static void main(String[] args) {

		// ��������
		Student s = new Student();

		// �����Ա����ֵ
		System.out.println(s.name + "-----" + s.age);

		// ����Ա������ֵ
		s.name = "����ӱ";
		s.age = 28;

		// �ٴ������Ա����ֵ
		System.out.println(s.name + "-------" + s.age);

		// ���ó�Ա����
		s.study();
		s.eat();
	}
}
