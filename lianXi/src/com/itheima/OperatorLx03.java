package com.itheima;

/*
 * 关系运算符：== ,!=, >, >=, < ,<=
 * 关系运算符的结果是boolean类型
 */
public class OperatorLx03 {
	public static void main(String[] args) {
		// 定义变量
		int a = 3;
		int b = 4;
		int c = 3;
		// == , !=
		System.out.println(a == b);// false
		System.out.println(a != b);// true
		System.out.println(a == c);// true
		// < ,<=
		System.out.println(a < b);// true
		System.out.println(a <= b);// true
		System.out.println(a <= c);// true
		// > ,>=
		System.out.println(a > b);// false
		System.out.println(a > c);// false
		System.out.println(a >= c);// true

	}

}
