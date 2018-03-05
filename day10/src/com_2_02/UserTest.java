package com_2_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
 2. user.txt文件中初始存放的用户信息有如下：
 jack,123
 rose,123
 tom,123
 3.要求完成如下功能：
 程序运行时：控制台提示用户输入注册的用户名和密码；
 验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
 是：控制台提示：用户名已存在
 否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功；

 */
public class UserTest {
	public static void main(String[] args) throws IOException {

		// 首先读取文件中的内容
		BufferedReader br = new BufferedReader(new FileReader("user.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			String[] str = line.split(",");

			// 创建键盘录入对象
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < str.length; i++) {
				System.out.println("请按格式输入:用户名，密码");
				String len = sc.nextLine();
				String[] str1 = len.split(",");

				if (str[0].equals(str1[0])) {
					System.out.println("用户名已存在");
					break;
				} else {

					// 将注册的用户写到文件中
					BufferedWriter bw = new BufferedWriter(new FileWriter(
							"user.txt", true));
					bw.write(str1[0]);
					bw.write(",");
					bw.write(str1[1]);
					bw.newLine();
					System.out.println("注册成功");
					bw.close();
				}
			}
		}
		br.close();
	}
}
