package com.itheima01;
/*
 * �����ַ���(��ȡ�ַ����е�ÿһ���ַ�)
 * 
 * ����: 
 * 			ͨ���ַ����Ļ�ȡ�����е�length()��charAt()���ܱ�������
 * 			
 */
public class Test06 {
	public static void main(String[] args) {
		//1��ͨ���ַ����Ļ�ȡ�����е�length()��charAt()���ܱ�������
		String s = "hello";
		
		//ԭʼ����
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
	    //��forѭ������
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
