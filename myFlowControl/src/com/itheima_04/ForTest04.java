package com.itheima_04;

/*
 * 求1-100之间的偶数和 
 * 首先要先获取1-100之间的数据，然后再判断是否是偶数，最后相加
 */
public class ForTest04 {
	public static void main(String[] args) {
		// 定义求和变量
		int sum = 0;

		// 获取1-100之间的数据，用for循环实现
		for (int i = 1; i <= 100; i++) {
			// 获取到的数据判断是否是偶数
			if (i % 2 == 0) {
				// 获取到的偶数相加
				sum += i;
			}
		}
		// 输出和
		System.out.println("sum:" + sum);
	}
}
