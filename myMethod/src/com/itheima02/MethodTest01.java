package com.itheima02;

/*
 * 写一个方法，传递一个整数(大于1)，在控制台打印1到该数据的值
 * 
 */
public class MethodTest01 {
	public static void main(String[] args) {
		
		//调用方法
		printNumber(3);
		System.out.println("--------------");
		printNumber(4);
		System.out.println("--------------");
		printNumber(5);
	}
	public static void printNumber(int n){
		for (int i = 1; i < n; i++) {
			System.out.println(i);
		}
	}
}
