package com.itheima_04;
/*
 * String 的转换功能
 * 
 * char[] toCharArray():将字符串转换为字符数组
 * String toLowerCase():将字符串全部转换为小写
 * String toUpperCase():将字符串全部转换为大写
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		//创建一个字符串
		String s = "abcde";
		
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println("helloWORLD".toUpperCase());
		System.out.println("helloWORLD".toLowerCase());
	}
}
