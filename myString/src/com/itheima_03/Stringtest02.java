package com.itheima_03;

import java.util.Scanner;

/*
 * 统计一个字符串中的大写字母  小写字母  以及数字的个数
 */
public class Stringtest02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();

		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= '0' && ch <= '9') {
				numberCount++;
			} else {
				System.out.println("该字符" + ch + "非法");
			}
		}
		System.out.println("大写字母个数：" + bigCount);
		System.out.println("小写字母个数：" + smallCount);
		System.out.println("数字个数：" + numberCount);
	}
}
