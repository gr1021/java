package com.itheima;
/*
 * 三元运算符：
 * 			关系表达式？表达式1：表达式2；
 */
public class OperatorLx05 {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		int x = (a > b)?a : b;
		System.out.println(x);
	}
}
