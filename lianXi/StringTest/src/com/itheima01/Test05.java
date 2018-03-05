package com.itheima01;
/*
 *   String类的获取功能：
 * int length():获取字符串的长度，其实也就是字符个数
 * char charAt(int index):获取指定索引处的字符
 * int indexOf(String str):获取str在字符串对象中第一次出现的索引
 * String substring(int start):从start开始截取字符串
 * String substring(int start,int end):从start开始，到end结束截取字符串。包括start，不包括end
 */
public class Test05 {
	public static void main(String[] args) {
		String s1 = new String("helloworld");
		String s2 = "hello";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(4));
		System.out.println("-------------------");
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.indexOf("e"));
		
		System.out.println("-----------------");
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(0,s2.length()));
		System.out.println(s1.substring(5,s1.length()));
		System.out.println("----------------------");
		
		
	}
}
