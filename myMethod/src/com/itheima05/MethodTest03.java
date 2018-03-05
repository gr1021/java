package com.itheima05;

/*
 * 利用方法获取最小值的练习。
 */
public class MethodTest03 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 12, 23, 44, 11, 34 };
		// 方法调用
		int min = getMin(arr);
		System.out.println("min:" + min);
	}

	// 求最小值方法
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
