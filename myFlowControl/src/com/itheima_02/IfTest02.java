package com.itheima_02;

import java.util.Scanner;

/*
 * 键盘录入成绩，成绩在90——100之间属于"优秀";80-90属于"好";
 * 70-80属于"良";60-70属于"及格";
 */
public class IfTest02 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入成绩：");
		int a = sc.nextInt();

		if (a >= 90 && a < 100) {
			System.out.println("优秀");
		} else if (a >= 80 && a < 90) {
			System.out.println("好");
		} else if (a >= 70 && a < 80) {
			System.out.println("良");
		} else if (a >= 60 && a < 70) {
			System.out.println("及格");
		} else if (a >= 0 && a < 60) {
			System.out.println("不及格");
		} else {
			System.out.println("你输入的成绩有误");
		}
	}
}
