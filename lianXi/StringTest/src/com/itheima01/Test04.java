package com.itheima01;

import java.util.Scanner;

/*
 * 模拟登录,给三次机会,并提示还有几次。
 * 
 * 分析：1、首先定义用户名和密码，存储在内存中
 * 		2、然后键盘录入用户名和密码
 * 		3、 二者之间进行比较，看是否相同，若相同则登录成功，否则登录失败
 * 
 */
public class Test04 {
	public static void main(String[] args) {
		String username = "admin";
		String password = "12345";
		for (int i = 0; i < 3; i++) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = sc.nextLine();
		System.out.println("请输入密码：");
		String psw = sc.nextLine();
		
		if (name.equals(username) && psw.equals(password)) {
			System.out.println("登录成功");
			break;
		}else{
			if (2-i==0) {
				System.out.println("你的用户名和密码已被锁定，请与管理人员联系");
			}
			System.out.println("登录失败，你还有"+(2-i)+"次机会");
		}
		}
	}
}
