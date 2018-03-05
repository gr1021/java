package com.itheima_03;

import java.util.ArrayList;

public class ArrayListDemo01 {
	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<String>();

		array.add("hello");
		array.add("world");
		array.add(1, "java");

		System.out.println(array);
	}
}
