package com.itheima_05;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<Student> array = new ArrayList<Student>();
		
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		//��������
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
	public static void addStudent(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ����������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		
		//����ѧ������
		Student s = new Student(name,age);
		//s.setName(name);
		//s.setAge(age); 
		
		array.add(s);
		
		
	}
}
