package com.itheima;

import java.util.Scanner;

/*
 *  需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值。
 * 请写代码实现。(不考虑小数部分)
 */
public class Test05 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		//键盘录入数据
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第"+(i+1)+"个评委给出的分数");
			int score = sc.nextInt();
			arr[i] = score;
		}
		
		//方法调用
		int sum = sum(arr);
		int max = getMax(arr);
		int min = getMin(arr);
		
		double avg = (sum -max - min) / (arr.length -2);
		System.out.println("最后得分是：" + avg);
	}
	
	//求总和方法
	public static int sum(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//求最大值方法
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//求最小值方法
	public static int getMin(int[] arr){
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
