package com.itheima_03;

import java.util.ArrayList;

public class ArrayListdemo02 {
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
		//���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("Java");
		
		//��ȡ���ϳ���
//		System.out.println("size:"+array.size());
		
		//��ȡָ����������Ԫ��
//		System.out.println("get:"+array.get(2));
//		System.out.println("get:"+array.get(1));
		
		//ɾ��Ԫ��
//		System.out.println("remove:"+array.remove(0));
//		System.out.println("remove:"+array.remove("Java"));
		
//		System.out.println("set:"+array.set(1, "android"));
		array.add(2, "android");
		
		System.out.println("array:"+array);
		
	}
}
