package com.itheima_03;
/*
 * String �Ļ�ȡ����
 * 	int length():��ȡ�ַ����ĳ��ȣ���ʵҲ�����ַ�����
 *  char charAt(int index):��ȡָ�����������ַ�
 *  int indexOf(String str):��ȡstr���ַ��������е�һ�γ��ֵ�����
 *  String substring(int start):��start��ʼ��ȡ�ַ���
 *  String substring(int start,int end):��start��ʼ����end������ȡ�ַ���������start��������end 
 */
public class StringDemo {
	public static void main(String[] args) {
		
		String s = "HelloWorld";
		
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println("------------------");
		
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("e"));
		System.out.println(s.indexOf("ak"));
		System.out.println("---------------------");
		
		System.out.println(s.substring(3));
		System.out.println(s.substring(5));
		System.out.println("-----------------------");
		
		System.out.println(s.substring(0, s.length()));
		System.out.println(s.substring(4, s.length()));
	}
}
