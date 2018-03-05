package com.itheima_05;

/*
 * 用while循环实现打印1-100之间的和
 */
public class WhileDemo01 {
	public static void main(String[] args) {
		int sum = 0;
		// 初始化值
		int x = 1;

		// 判断条件表达式
		while (x <= 100) {
			sum += x;
			x++;
		}
		System.out.println(sum);
	}

}
