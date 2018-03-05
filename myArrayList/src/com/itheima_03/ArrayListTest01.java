package com.itheima_03;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		//添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//遍历集合
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(s);
		}
	}
}
