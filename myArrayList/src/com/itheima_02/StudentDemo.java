package com.itheima_02;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����һ�����ϣ��洢ѧ������ѧ����������������ڼ���¼�룬��󣬱�������
 */
public class StudentDemo {
	public static void main(String[] args) {
		
		ArrayList<Student> array = new ArrayList<Student>();
		
		array1(array);
		array1(array);
		array1(array);
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
	public static void array1(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ����������");
		String name = sc.nextLine();
		System.out.println("������ѧ�������䣺");
		String age = sc.nextLine();
		
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		array.add(s);
	}
	
}
