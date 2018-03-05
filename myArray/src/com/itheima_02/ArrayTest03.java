package com.itheima_02;

/*
 * 需求：获取数组中的最小值)
 */
public class ArrayTest03 {
	public static void main(String[] args) {

		// 定义数组
		int[] arr = { 12, 34, 54, 21, 67, 22 };

		// 参照物
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			// 比较
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		// 输出
		System.out.println("最小值是：" + min);
	}
}
