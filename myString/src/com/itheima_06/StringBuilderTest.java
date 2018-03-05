package com.itheima_06;

import java.util.Scanner;

/*
 * 把字符串反转        String----StringBuilder----String
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
		String result =  reverse(s);
		System.out.println(result);
	}
	//写反转的方法
	public static String reverse(String s){
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String result = sb.toString();
		
		return result;
	}
}
