package com.itheima_03;
/*
 * 关系运算符：== ，!= ，> ,>=,<, <=
 * 关系运算的结果是boolean
 */
public class OperatorDemo01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		//==
		System.out.println(a == c);//true
		System.out.println(a == b);//false
		System.out.println("------------------------------");
		// !=
		System.out.println(a != c);//false
		System.out.println(a != b);//true
		System.out.println("------------------------------");
		// >
		System.out.println(a > c);//false
		System.out.println(b > a);//true
		System.out.println("----------------------------------");
		// >=
		System.out.println(a >= c);//true
		System.out.println(a >= b);//false
		System.out.println("----------------------------------");
		// <
		System.out.println(a < b);//true
		System.out.println(b < c);//false
		System.out.println("----------------------------------");
		// <=
		System.out.println(a <= c);//true
		System.out.println(a <= b);//true
		
	}
}
