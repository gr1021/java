package com.itheima_06;

import java.util.Scanner;

/*
 * 判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * 
 * 分析： 将字符串转换为StringBuilder，然后进行反转，看与之前的字符串是否相等
 */
public class StringBuilderTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
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
