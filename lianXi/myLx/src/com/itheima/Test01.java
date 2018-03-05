package com.itheima;

import java.util.Scanner;

/*
 *键盘录入两个数据，求出两个数据的最大值
 */
public class Test01 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//接收数据
		System.out.println("请输入第一个数据："); 
		int x = sc.nextInt();
		
		System.out.println("请输入第二个数据："); 
		int y = sc.nextInt();
		
		
		if (x > y) {
		
			System.out.println("大的值是："+ x);
		}else{
			System.out.println("大的值是："+ y);
		}
	}
}
