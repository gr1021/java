package com.itheima_03;

import java.util.ArrayList;

public class ArrayListTest03 {
	public static void main(String[] args) {
		//定义字符串数组
		String[] str = {"张三丰","张无忌","宋远桥","殷梨亭","张翠山","莫声谷"};
		
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		//遍历字符串数组，添加到集合中
		for (int i = 0; i < str.length; i++) { 
			array.add(str[i]);
		}
		
		//遍历集合，并按要求判断
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			if (s.startsWith("张")) {
				System.out.println(s);
			}
		}
	}
}
