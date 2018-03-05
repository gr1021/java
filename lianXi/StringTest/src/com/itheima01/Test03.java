package com.itheima01;
/*
 * String类的判断功能：
 * boolean equals(Object obj):比较字符串的内容是否相同
 * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
 * boolean startsWith(String str):判断字符串对象是否以指定的str开头
 * boolean endsWith(String str):判断字符串对象是否以指定的str结尾
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
