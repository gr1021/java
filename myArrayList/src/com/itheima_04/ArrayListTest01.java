package com.itheima_04;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		
		ArrayList<Student> array = new ArrayList<Student>();
		
		Student s1 = new Student("ÕÔÀöÓ±",29);
		Student s2 = new Student("ÑîÃİ",29);
		Student s3 = new Student("ÁõÊ«Ê«",28);
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}
