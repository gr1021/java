package com.itheima_02;

import java.util.ArrayList;

/*
 * ´æ´¢×Ö·û´®²¢±éÀú
 */
public class ArrayListTest01 {
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("hello");
		array.add("world");
		array.add("java");
		
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(s);
		}
	}
}
