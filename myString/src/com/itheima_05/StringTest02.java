package com.itheima_05;

import java.util.Scanner;

/*
 * ���ַ�����ת   abc ת����Ϊcba
 */
public class StringTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		String ss = reverse(s);
		System.out.println(ss);
	}
	public static String reverse(String s){
		
		char[] ch = s.toCharArray();
		for (int start = 0,end = ch.length-1; start < end; start++,end--) {
			
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
		}
		String ss = new String(ch);
		return ss;
	}
}
