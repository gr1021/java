package com.itheima_02;

import java.util.ArrayList;

public class arrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("Hello");
		array.add("World");
		array.add("java");
		
		array.add(2,"nihao");
		
		System.out.println("array:"+array);
	}
}
