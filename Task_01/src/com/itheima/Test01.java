package com.itheima;

import java.util.Scanner;

/*
 * 需求：键盘录入一个月份，输出该月份对应的季节。
 * 		一年有四季
 * 		3,4,5	春季
 * 		6,7,8	夏季
 * 		9,10,11	秋季
 * 		12,1,2	冬季
 * 分析：
 * 		用if语句实现
 * 		1、键盘录入数据
 * 		2、写一个方法实现
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个月份数据：");
		int month = sc.nextInt();
		
		String season = printSeason(month);
		System.out.println(season);
	}
	public static String printSeason(int month){
		if (month == 1 || month ==2 || month == 12) {
			return "冬季";
		}else if (month >= 3 && month <=5) {
			return "春季";
		}else if (month >= 6 && month <=8) {
			return "夏季";
		}else if (month >= 9 && month <=11) {
			return "秋季";
		}else{
			return "你输入的月份不符合";
		}
	}
}
