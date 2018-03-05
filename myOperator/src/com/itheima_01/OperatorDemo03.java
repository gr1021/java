package com.itheima_01;
/*
 * +: 加法运算
 * 
 * 与字符进行加法运算
 * 'A' 65
 * 'a' 97
 * '0' 48
 * 与字符串相加，即进行拼接
 */
public class OperatorDemo03 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a + b);
		System.out.println("-----------------");
	    //与字符进行加法运算
		char x = 'a';
		System.out.println(a + x);
		//与字符串进行加法运算时会是拼接起来
		String  y = "hello";
		System.out.println(y+a);//hello10
		System.out.println(y+a+b);//hello1020
		System.out.println(a+b+y);//30hello
		
	}
}
