package com.itheima_06;

import java.util.Scanner;

/*
 * ���ַ�����ת        String----StringBuilder----String
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		String result =  reverse(s);
		System.out.println(result);
	}
	//д��ת�ķ���
	public static String reverse(String s){
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String result = sb.toString();
		
		return result;
	}
}
