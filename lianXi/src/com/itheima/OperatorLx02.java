package com.itheima;

/*
 * 赋值运算符：
 * 			基本赋值运算符：=
 * 			扩展运算符：+=，-=，*=，/=
 * 
 */
public class OperatorLx02 {
	public static void main(String[] args) {
		// 定义变量，用到赋值符号=
		int a = 10;
		int b = 20;
		// +=
		a += b;
		System.out.println(a);
		// -=
		a -= b;
		System.out.println(a);
		System.out.println(a -= b);
		//*=
		a *= b;
		System.out.println(a);
		// /=
		a /= b;
		System.out.println(a);
		
	}
}
