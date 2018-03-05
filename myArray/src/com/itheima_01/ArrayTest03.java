package com.itheima_01;

/*
 * 需求：定义两个数组，先定义一个数组，赋值，输出。然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组。
 * 然后给第二个数组赋值，再次输出两个数组的名及元素。
 */
public class ArrayTest03 {
	public static void main(String[] args) {
		//先定义一个数组
		int[] arr1 = new int[3];
		
		//赋值
		arr1[0] = 10;
		arr1[1] = 11;
		arr1[2] = 12;
		
		//输出
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		//然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组
		int[] arr2 = arr1;
		
		//然后给第二个数组赋值
		arr2[0] = 3;
		arr2[1] = 4;
		arr2[2] = 5;
		
		//再次输出两个数组的名及元素
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		//arr2数组
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
	}
}
