package com.itheima_05;

/*
 * 求三个整数的最大值
 */
public class OperatorTest02 {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		int b = 20;
		int c = 30;

		int x = (a > b) ? a : b;
		int max = (x > c) ? x : c;

		System.out.println("max:" + max);
	}
}
