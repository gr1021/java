package com.itheima_03;

import java.util.ArrayList;

/*
 * �洢�ַ���Ԫ�ز�����
 */
public class ArrayListTest02 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		//���Ԫ��
		array.add("����ӱ");
		array.add("�ָ���");
		array.add("����");
		array.add("���");
		
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(s);
		}
		
	}
}
