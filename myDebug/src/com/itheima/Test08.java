package com.itheima;

import java.util.Scanner;

/*
 * 需求：数组元素查找(查找指定元素第一次在数组中出现的索引)
 *(1)给定数组int[] arr = {5,7,3,2,5};
 *(2)要查询的元素通过键盘录入的方式确定
 *(3)定义一个查找数组元素第一次出现位置的方法(注,要查找的元素就是键盘录入的数据)
 *
 */
public class Test08 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {5,7,3,2,5};
		
		//键盘录入要查找的数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要查询的元素:");
		int x = sc.nextInt();
		
		
		int index = getNum(arr,x);
		System.out.println("index:"+index);
		
	}
	public static int getNum(int[] arr,int value){
		
		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
					return i;
			}
		}
		return -1;
	}
}
