package com.itheima_02;

import java.util.ArrayList;

public class arraylistDemo02 {
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
		//���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		
		//ɾ��Ԫ��
//		array.remove(0);
//		System.out.println("remove:"+array.remove(0));
//		System.out.println(array.remove("java"));
//		array.remove(0);
		//�޸�Ԫ��
//		System.out.println(array.set(0, "nihao"));
		
		//��ȡ����
//		System.out.println(array.size());
		
		//��ȡĳ��Ԫ��
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		
		System.out.println("array:"+array);
	}
}
