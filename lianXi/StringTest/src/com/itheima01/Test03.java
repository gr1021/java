package com.itheima01;
/*
 * String����жϹ��ܣ�
 * boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ
 * boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
 * boolean startsWith(String str):�ж��ַ��������Ƿ���ָ����str��ͷ
 * boolean endsWith(String str):�ж��ַ��������Ƿ���ָ����str��β
 */
public class Test03 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "Hello";
		String s3 = new String("hello");
		String s4 = "hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println("------------------");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println("----------------------");
		
		System.out.println(s1.startsWith("h"));
		System.out.println(s2.startsWith("h"));
		System.out.println(s2.endsWith("o"));
		
	}
}
