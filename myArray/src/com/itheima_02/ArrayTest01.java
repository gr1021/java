package com.itheima_02;

/*
 * * 需求：数组遍历(依次输出数组中的每一个元素)
 */
public class ArrayTest01 {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 11, 24, 34, 45, 32, 12 };

		System.out.println("数组共有" + arr.length + "个");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
