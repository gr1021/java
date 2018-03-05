package com.itheima05;

/*
 * 把遍历数组改进为方法实现，并调用方法
 * 想要输出的结果是这个样子的：[11, 22, 33, 44, 55]
 */
public class MethodTest01 {
	public static void main(String[] args) {
		
		int[] arr ={11,22,33,44,55};
		printArray(arr);
	}
	public static void printArray(int[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == (arr.length -1)) {
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
}
