package com.itheima_06;

/*
 * do...while 语句格式：
 * 				do{
 * 				循环语句体;
 * 			}while(判断条件语句);
 * 	扩展格式：
 * 				初始化语句;
 * 				do{
 * 				循环语句体;
 * 				控制条件语句;
 * 	}while(判断条件语句);
 * 求和案例 1-10
 * 
 */
public class DoWhileDemo01 {
	public static void main(String[] args) {
		// 定义求和变量
		int sum = 0;
		// 初始化语句
		int x = 1;
		do {
			sum += x;
			x++;
		} while (x <= 10);
		System.out.println(sum);
	}
}
