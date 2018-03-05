package com.itheima01;
/*
 *   String:字符串类
 * 		由多个字符组成的一串数据
 * 		字符串其本质是一个字符数组
 * 
 * 构造方法：
 * 		String(String original):把字符串数据封装成字符串对象
 * 		String(char[] value):把字符数组的数据封装成字符串对象
 * 		String(char[] value, int index, int count):把字符数组中的一部分数据封装成字符串对象
 * 
 * 注意：字符串是一种比较特殊的引用数据类型，直接输出字符串对象输出的是该对象中的数据
 */
public class Test01 {
	public static void main(String[] args) {
		
		String s = new String();
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println("s:"+s);
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("--------------");
		
		char[] chs = {'h','e','l','l','o'};
		String s3 = new String(chs);
		System.out.println("s3:"+s3);
		System.out.println("-------------------");
		
		String s4 = new String(chs,1,3);
		System.out.println("s4:"+s4);
	}
}
