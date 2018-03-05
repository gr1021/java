package com.itheima_01;

/*
 * 需求：定义两个数组，分别输出数组名及元素。
 * 然后分别给数组中的元素赋值，分别再次输出数组名及元素。
 */
public class ArrayTest02 {
	public static void main(String[] args) {
		// 定义两个数组，分别输出数组名及元素。
		int[] arr1 = new int[3];
		int[] arr2 = new int[2];

		// 分别输出数组名及元素。
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);

		// 然后分别给数组中的元素赋值，分别再次输出数组名及元素。
		arr1[0] = 10;
		arr2[1] = 30;

		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);

	}
}
