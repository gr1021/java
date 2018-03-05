package com.itheima_02;

import java.util.ArrayList;

public class arraylistDemo02 {
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
		//添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		
		//删除元素
//		array.remove(0);
//		System.out.println("remove:"+array.remove(0));
//		System.out.println(array.remove("java"));
//		array.remove(0);
		//修改元素
//		System.out.println(array.set(0, "nihao"));
		
		//获取长度
//		System.out.println(array.size());
		
		//获取某个元素
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		
		System.out.println("array:"+array);
	}
}
