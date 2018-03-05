package com.itheima;

/*
 * 不死神兔问题,求第二十个月有多少只兔子
 * 第一个月:1
 * 第二个月:1
 * 第三个月:2
 * 第四个月:3
 * 第五个月:5
 * ....
 * int[] arr = new int[20];
 * arr[0] = 1;  arr[1] = 1;
 * arr[2] = arr[1] + arr[0];
 * arr[3] = arr[2] + arr[1];
 * ....
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		int[] arr =new int[20];
		
		int x = count(arr);
		System.out.println(x);
	}
	public static int count(int[] arr){
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		return arr[19];
	}
}
