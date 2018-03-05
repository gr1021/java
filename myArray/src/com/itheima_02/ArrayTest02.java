package com.itheima_02;

/*
 *  需求：获取数组中的最大值
 */
public class ArrayTest02 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {12,23,4,43,54,51};
		
		//求最大值
		int max = arr[0];
		for(int i = 1;i < arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("最大值是:"+max);
	}
}
