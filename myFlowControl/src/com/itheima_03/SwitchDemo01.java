package com.itheima_03;

import java.util.Scanner;

/*
 * switch语句格式：
 * 			switch(表达式) {
 * 				case 值1:
 * 					语句体1;
 * 					break;
 *				 case 值2:
 * 					语句体2;
 * 					break;
 * 				 case 值3:
 * 					语句体3;
 * 					break;
 * 					......
 * 				default:
 * 					语句体n + 1;
 * 					break;
 * }
 */
public class SwitchDemo01 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入数据(1-7)：");
		int weekday = sc.nextInt();

		switch (weekday) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("你输入的数据有误");
			break;
		}

	}
}
