package com.itheima_03;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//��������
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(s);
		}
	}
}
