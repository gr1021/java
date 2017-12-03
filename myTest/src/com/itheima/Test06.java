package com.itheima;

import java.util.Scanner;

/*
 * 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值。
 * 请写代码实现。(不考虑小数部分)
 */
public class Test06 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		//方法调用
		addNumber(arr);
		int max = getMax(arr);
		int min = getMin(arr);
		int sum = sum(arr);

		double avg = (sum - max - min) / (arr.length - 2);
		System.out.println("最后得分是：" + avg);
	}

	// 键盘录入数据的方法
	public static void addNumber(int[] arr) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数据:");
			int score = sc.nextInt();
			
			if (score > 100 || score < 0) {
				i--;
				continue;
			}else {
				arr[i] = score;
			}
		}
	}

	// 求最大值的方法
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// 获取最小值的方法
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// 获取总和的方法
	public static int sum(int[] arr) {
		int sum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
