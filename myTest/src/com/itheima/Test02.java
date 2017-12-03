package com.itheima;

import java.util.Scanner;

/*
 * 需求：键盘录入一个月份，输出该月份对应的季节。
 * 		一年有四季
 * 		3,4,5	春季
 * 		6,7,8	夏季
 * 		9,10,11	秋季
 * 		12,1,2	冬季
 * 分析：用switch语句实现  写一个方法实现
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = sc.nextInt();

		String season = getSeason(month);
		System.out.println(season);

	}

	public static String getSeason(int month) {
		switch (month) {
		case 1:
		case 2:
		case 12:
			return "冬季";
		case 3:
		case 4:
		case 5:
			return "春季";
		case 6:
		case 7:
		case 8:
			return "夏季";
		case 9:
		case 10:
		case 11:
			return "秋季";
		default:
			return "你输入的月份有误";
		}
	}
}
