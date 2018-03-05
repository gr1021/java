package com.itheima04;

/*
 * 如果参数是引用数据类型：
 * 		形式参数的改变直接影响实际参数
 */
public class ArgsDemo2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------------");
		change(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void change(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 == 0) {
				arr[j] *= 2;
			}
		}
	}
}
