package com.itheima_02;

import java.util.ArrayList;

/*
 *  ����һ���ַ������飺{�������ᡱ,����Զ�š�,�����޼ɡ�,������ͤ��,���Ŵ�ɽ��,��Ī���ȡ�}��
 *  �������е�Ԫ����ӵ������У������������ŵ���Ա��ӡ������̨�ϡ�
 */
public class ArrayListTest02 {
	public static void main(String[] args) {
		String[] str = {"������","��Զ��","���޼�","����ͤ","�Ŵ�ɽ","Ī����"};
		
		ArrayList<String> array = new ArrayList<String>();
		
		for (int i = 0; i < str.length; i++) {
			 array.add(str[i]);
		}
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			if (s.startsWith("��")) {
				System.out.println(s);
			}
		}
	}
}
