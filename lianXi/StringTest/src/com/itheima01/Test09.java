package com.itheima01;

import java.util.Scanner;

/*
 * 键盘录入一个字符串，把该字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
 */
public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
		String s1 = s.substring(0,1);
		String s2 = s.substring(1);
		String s3 = s1.toUpperCase() + s2.toLowerCase();
		System.out.println("s3:"+s3);
	}
}
