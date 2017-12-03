package com.itheima;

import java.util.Scanner;

/*
 * 需求：
 * (1)键盘录入5个int类型的数据存储数组arr中
 * (2)定义方法将arr数组中的内容反转
 * (3)定义方法对反转后的数组进行遍历
 */
public class Test07 {
	public static void main(String[] args) {
		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数据");
			int x = sc.nextInt();
			arr[i] = x;
		}
		//调用方法
		printArray(arr);
		
		//反转方法
		reverse(arr);
		
		//反转后
		printArray(arr);
	}

	// 遍历数组的方法
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}
	
	//数组反转的方法
	public static void reverse(int[] arr){
		for (int start = 0, end = arr.length - 1; start <= end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
}
