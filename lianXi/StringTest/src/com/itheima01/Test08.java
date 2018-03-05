package com.itheima01;
/*
 *  String类的转换功能：
 * char[] toCharArray():把字符串转换为字符数组
 * String toLowerCase():把字符串转换为小写字符串
 * String toUpperCase():把字符串转换为大写字符串
 */
public class Test08 {
	public static void main(String[] args) {
		String s = "helloWorld";
		
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
		System.out.println("-----------------");
		System.out.println(s.toLowerCase());
		System.out.println("-----------------");
		System.out.println(s.toUpperCase());
		
		System.out.println("hello".toUpperCase());
	}
}
