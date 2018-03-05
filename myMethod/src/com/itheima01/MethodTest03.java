package com.itheima01;

import java.util.Scanner;

/*
 * 键盘录入三个数据，返回三个数据的最大值
 */
public class MethodTest03 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		System.out.println("请输入第三个数据：");
		int c = sc.nextInt();
		
		//调用方法
		int max = getMax(a,b,c);
		System.out.println("max:"+max);
	}

	public static int getMax(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b > c) {
				return b;
			} else {
				return c;
			}
		}
	}
}
