package com.itheima01;

import java.util.Scanner;

/*
 * 键盘录入两个数据，判断是否相等
 */
public class MethodTest02 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int y = sc.nextInt();

		boolean b = compare(x, y);
		System.out.println(b);
	}

	/*
	 * 两个明确： 返回值类型：boolean 参数列表：int a, int b
	 */
	public static boolean compare(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}
}
