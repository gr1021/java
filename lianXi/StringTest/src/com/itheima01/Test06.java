package com.itheima01;
/*
 * 遍历字符串(获取字符串中的每一个字符)
 * 
 * 分析: 
 * 			通过字符串的获取功能中的length()和charAt()功能遍历数组
 * 			
 */
public class Test06 {
	public static void main(String[] args) {
		//1、通过字符串的获取功能中的length()和charAt()功能遍历数组
		String s = "hello";
		
		//原始做法
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
	    //用for循环遍历
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
