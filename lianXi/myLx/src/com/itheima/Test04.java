package com.itheima;

import java.util.Scanner;

/*
 *键盘录入两个数据，比较两个数是否相等
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输如第一个数据:");
		int x = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int y = sc.nextInt();
		
		int max = getMax(x, y);
		System.out.println(max);
	}
	public static int getMax(int a , int b){
		int max = (a > b) ? a : b;
		return max;
	}
}
