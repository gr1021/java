package com.itheima_03;

import java.util.ArrayList;

/*
 * 存储字符串元素并遍历
 */
public class ArrayListTest02 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		//添加元素
		array.add("赵丽颖");
		array.add("林更新");
		array.add("李沁");
		array.add("窦骁");
		
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(s);
		}
		
	}
}
