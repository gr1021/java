package com.itheima_05;

/*
 * 比较两个整数是否相同
 */
public class OperatorTest01 {
	public static void main(String[] args) {
		// 定义两个变量
		int a = 10;
		int b = 20;

		boolean flag = (a == b) ? true : false;
		// 优化后
		// boolean flag = (a == b);
		System.out.println("flag:" + flag);
	}
}
