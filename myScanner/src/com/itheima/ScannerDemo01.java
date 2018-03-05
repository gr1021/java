package com.itheima;

import java.util.Scanner;

/*
 * 为了提高程序的灵活性，将数据改进为键盘录入
 * A、导包
 * 		import java.util.Scanner;
 * 		在一个类的顺序中，package > import > class
 * B、创建键盘录入对象
 * 		Scanner sc = new Scanner(System.in);
 * C、 接收数据
 * 		int i = sc.nextInt();
 */
public class ScannerDemo01 {
	public static void main(String[] args) {
		// 键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请录入一个数据：");
		int x = sc.nextInt();

		System.out.println("x:" + x);
	new Scanner(System.in);
	}
}
