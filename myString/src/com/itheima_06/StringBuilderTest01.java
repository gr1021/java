package com.itheima_06;

import java.util.Scanner;

/*
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 * ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 * 
 * ������ ���ַ���ת��ΪStringBuilder��Ȼ����з�ת������֮ǰ���ַ����Ƿ����
 */
public class StringBuilderTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		boolean flag = test(s);
		System.out.println(flag);
	}
	public static boolean test(String s){
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String result = sb.toString();
		return result.equals(s);
	}
}
