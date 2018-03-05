package com.itheima_03;

import java.util.ArrayList;

public class ArrayListdemo02 {
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
		//添加元素
		array.add("hello");
		array.add("world");
		array.add("Java");
		
		//获取集合长度
//		System.out.println("size:"+array.size());
		
		//获取指定索引处的元素
//		System.out.println("get:"+array.get(2));
//		System.out.println("get:"+array.get(1));
		
		//删除元素
//		System.out.println("remove:"+array.remove(0));
//		System.out.println("remove:"+array.remove("Java"));
		
//		System.out.println("set:"+array.set(1, "android"));
		array.add(2, "android");
		
		System.out.println("array:"+array);
		
	}
}
