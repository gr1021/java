package com;

/*
 * 6. 把一个数组中的最大值和最小值进行互换
 * 分析：1、定义数组
 * 		2、求出数组最大值和最小值
 * 		3、交换最大值，最小值
 */
public class Test02 {
	public static void main(String[] args) {
		int[] arr = {12,14,23,43,11};
		
		int max = arr[0];
		int min = arr[0];
		int a = 0;
		int b = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max ) {
				max = arr[i];
				a = i;
			}
			if (arr[i] < min ) {
				min =arr[i];
				b = i;
			}
		}
		
		int temp = max;
		max = min;
		min = temp;
		
		arr[a] = max;
		arr[b] = min;
		System.out.println("交换后的最大值是：" + max);
		System.out.println("交换后的最小值是：" + min);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
