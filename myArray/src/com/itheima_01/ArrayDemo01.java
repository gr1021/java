package com.itheima_01;

/*
 * 定义格式：数据类型[] 数组名 
 * 		动态初始化：
 * 		数据类型[] 数组名 = new 数据类型[数组长度];
 */
public class ArrayDemo01 {
	public static void main(String[] args) {
		// 数据类型[] 数组名 = new 数据类型[数组长度];
		int[] arr = new int[4];

		System.out.println("arr:" + arr);// [I@3ef810

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	}
}
