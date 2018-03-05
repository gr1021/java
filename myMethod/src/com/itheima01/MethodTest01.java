package com.itheima01;

import java.util.Scanner;

/*
 * 键盘录入两个数据，比较最大值
 */
public class MethodTest01 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int y = sc.nextInt();

		// 调用方法
		int max = getMax(x, y);
		System.out.println("max:" + max);

	}
	/*
	 * 两个明确：
	 * 			返回值类型：int
	 * 			参数列表：int a, int b
	 */
	public static int getMax(int a, int b) {
		
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
