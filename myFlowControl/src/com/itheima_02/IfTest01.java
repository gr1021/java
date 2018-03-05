package com.itheima_02;

import java.util.Scanner;

/*
 * 键盘录入两个数据，求出两个数据的最大值
 */
public class IfTest01 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		/*if (a > b) {
			System.out.println("大的值是："+ a);
		} else {
			System.out.println("大的值是："+ b);
		}*/
		//为了更好的使用最后的大的值
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("max :" + max);
	}
}
