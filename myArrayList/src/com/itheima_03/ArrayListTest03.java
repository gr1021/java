package com.itheima_03;

import java.util.ArrayList;

public class ArrayListTest03 {
	public static void main(String[] args) {
		//�����ַ�������
		String[] str = {"������","���޼�","��Զ��","����ͤ","�Ŵ�ɽ","Ī����"};
		
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//�����ַ������飬��ӵ�������
		for (int i = 0; i < str.length; i++) { 
			array.add(str[i]);
		}
		
		//�������ϣ�����Ҫ���ж�
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			if (s.startsWith("��")) {
				System.out.println(s);
			}
		}
	}
}
