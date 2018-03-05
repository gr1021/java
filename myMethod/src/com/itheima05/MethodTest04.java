package com.itheima05;

/*
 * 写一个方法，用于对数组进行求和，并调用方法。
 */
public class MethodTest04 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 12, 23, 34, 22, 11 };
		// 方法调用
		int sum = getSum(arr);

		// 输出结果
		System.out.println("sum:" + sum);
	}

	// 写一个求和的方法
	/*
	 * 两个明确： 返回值类型：int 
	 * 			参数列表： int[] arr
	 */
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
