package com.itheima_04;

import java.util.Scanner;

/*
 * 写入一个字符串，首字母转换为大写 其他转换为小写
 */
public class StringTest {
	public static void main(String[] args) {
		
		//键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
		//截取首字母和其他字母
		String s1 = s.substring(0,1);
		String s2 = s.substring(1);
		
		//将首字母转换为大写，其他转换为小写，拼接起来
		String s3 = s1.toUpperCase() + s2.toLowerCase();
		System.out.println("s3:"+s3);
	}
}
