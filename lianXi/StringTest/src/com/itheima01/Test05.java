package com.itheima01;
/*
 *   String��Ļ�ȡ���ܣ�
 * int length():��ȡ�ַ����ĳ��ȣ���ʵҲ�����ַ�����
 * char charAt(int index):��ȡָ�����������ַ�
 * int indexOf(String str):��ȡstr���ַ��������е�һ�γ��ֵ�����
 * String substring(int start):��start��ʼ��ȡ�ַ���
 * String substring(int start,int end):��start��ʼ����end������ȡ�ַ���������start��������end
 */
public class Test05 {
	public static void main(String[] args) {
		String s1 = new String("helloworld");
		String s2 = "hello";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(4));
		System.out.println("-------------------");
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.indexOf("e"));
		
		System.out.println("-----------------");
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(0,s2.length()));
		System.out.println(s1.substring(5,s1.length()));
		System.out.println("----------------------");
		
		
	}
}
