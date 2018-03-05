package com.itheima;

import java.util.Scanner;

/*
 * 需求：键盘录入数据,要求数据是四位的整数,现需要对数据进行加密,加密规则如下:
 * 每位数字都加上5,然后除以10的余数代替该数字,
 * 再将第一位和第四位交换,第二位和第三位交换,
 * 请把加密后的数据输出到控制台
 * 4567
 */
public class Test09 {
	public static void main(String[] args) {
		// 键盘录入数据,要求数据是四位的整数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个四位数：");
		int number = sc.nextInt();

		int[] arr = new int[4];
		arr[0] = number / 10 / 10 / 10 % 10;
		arr[1] = number / 10 / 10 % 10;
		arr[2] = number / 10 % 10;
		arr[3] = number % 10;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 5;
			arr[i] %= 10;
		}
		
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		
		temp = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
