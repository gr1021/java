package com;

/*
 * 7. 定义两个int类型的数组,把第一个数组的最大值和第二个数组的最小值进行互换,
 * 然后遍历两个数组(数组中不包含重复的元素)
 * 分析：1、定义两个int类型的数组
 * 		2、把第一个数组的最大值和第二个数组的最小值进行互换
 * 			获取第一个数组的最大值和第二个数组的最小值
 * 		3、然后遍历两个数组(数组中不包含重复的元素)
 */
public class Test01 {
	public static void main(String[] args) {
		// 定义两个int类型的数组
		int[] arr = { 12, 13, 24, 23, 25 };
		int[] arr2 = { 11, 34, 25, 26, 45 };

		// 把第一个数组的最大值和第二个数组的最小值进行互换,
		int a = 0;
		int b = 0;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];// max = 25
				a = i;// a=4
			}
		}

		int min = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] < min) {
				min = arr2[i];// min = 11
				b = i;// b=0
			}
		}

		int temp = max;
		max = min;
		min = temp;// max = 11,min = 25

		// System.out.println("max:"+max);
		// System.out.println("min:"+min);

		arr[a] = max;
		arr2[b] = min;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
