package com.itheima_03;

public class StringTest {
	public static void main(String[] args) {
		//�����ַ�������
		String s = "abcde";
		
		//ԭʼ����
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println("--------------------------------");
		
		//��forѭ������
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
