package com.itheima_04;
/*
 * String ��ת������
 * 
 * char[] toCharArray():���ַ���ת��Ϊ�ַ�����
 * String toLowerCase():���ַ���ȫ��ת��ΪСд
 * String toUpperCase():���ַ���ȫ��ת��Ϊ��д
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "abcde";
		
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println("helloWORLD".toUpperCase());
		System.out.println("helloWORLD".toLowerCase());
	}
}
