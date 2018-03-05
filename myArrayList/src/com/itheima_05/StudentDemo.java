package com.itheima_05;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		//遍历集合
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
	public static void addStudent(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生的姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		
		//创建学生对象
		Student s = new Student(name,age);
		//s.setName(name);
		//s.setAge(age); 
		
		array.add(s);
		
		
	}
}
