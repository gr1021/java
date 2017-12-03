package com.itheima;

import java.util.Scanner;

/*
 * 不死神兔问题：
 * arr[0] = 1;
 * arr[1] = 1;
 * arr[2] = arr[1]+arr[0];
 * arr[3] = arr[2]+arr[1];
 * arr[4] = arr[3]+arr[2];
 * arr[5] = arr[4]+arr[3];
 */
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据：");
		int x = sc.nextInt();
		
		int y = rr(x);
		System.out.println(y);
		
	}
	public static int rr(int month){
		int[] arr = new int[month];
		if (month == 1 || month == 2) {
			return 1;
		}
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		return arr[month-1];
	}
}
