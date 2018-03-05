package com.itheima_02;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {

		String username = "abc";
		String password = "123";

		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String psw = sc.nextLine();

			if (name.equals(username) && psw.equals(password)) {
				System.out.println("登录成功");
				break;
			} else {
				if (2 - i == 0) {
					System.out.println("你的用户和密码已被锁定，请与管理员联系");
				} else {
					System.out.println("登录失败，你还有" + (2 - i) + "次机会");
				}
			}
		}
	}
}
