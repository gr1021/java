package com.itheima_05;

/*
 * 统计水仙花数的个数，用while循环实现
 * 首先获取水仙花数
 * 水仙花数是一个三位数，每个位上的数字立方和等于他本身
 */
public class WhileTest01 {
	public static void main(String[] args) {
		// 定义统计变量
		int count = 0;
		// 定义初始化值
		int x = 100;
		// 判断条件表达式
		while (x < 1000) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 100 % 10;
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == x) {
				count++;
				System.out.println(x);
			}
			x++;
		}
		System.out.println("count:" + count);
	}
}
