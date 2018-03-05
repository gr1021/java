package com.itheima_02;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 创建一个集合，存储学生对象，学生对象的数据来自于键盘录入，最后，遍历集合
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
		System.out.println("请输入学生的姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生的年龄：");
		String age = sc.nextLine();
		
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		array.add(s);
	}
	
}
