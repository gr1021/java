package com.itheima01;
/*
 *  String���ת�����ܣ�
 * char[] toCharArray():���ַ���ת��Ϊ�ַ�����
 * String toLowerCase():���ַ���ת��ΪСд�ַ���
 * String toUpperCase():���ַ���ת��Ϊ��д�ַ���
 */
public class Test08 {
	public static void main(String[] args) {
		String s = "helloWorld";
		
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
		System.out.println("-----------------");
		System.out.println(s.toLowerCase());
		System.out.println("-----------------");
		System.out.println(s.toUpperCase());
		
		System.out.println("hello".toUpperCase());
	}
}
