package com.itheima05;

/*
 * 把获取数组最值改进为方法实现，并调用方法
 */
public class MethodTest02 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr ={12,34,23,45,22};
		// 方法调用
		int max = getMax(arr);
		System.out.println("max:" + max);
		
	}
	//求和方法
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
