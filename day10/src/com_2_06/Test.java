package com_2_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现
 实现一个验证码小程序，要求如下：
 1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
 2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
 */
public class Test {
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		// 键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
		write(arr);
		// 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：
		// 在控制台提示验证成功，如果不存在控制台提示验证失败
		equals(arr);

		
	}
	@SuppressWarnings("unused")
	public static void equals(ArrayList<String> arr){
		//// 键盘录入一个需要被校验的验证码，
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个被校验的验证码：");
		String s = sc.nextLine();
		
		// 如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
		for (int i = 0; i < arr.size(); i++) {
			String ss = arr.get(i);
			if (s.equals(ss)) {
				System.out.println("验证成功");
				break;
			}else {
				System.out.println("验证失败");
				break;
			}
		}
		
	}

	public static void write(ArrayList<String> arr) throws IOException {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串验证码:");
		String s1 = sc.nextLine();
		System.out.println("请输入第二个字符串验证码:");
		String s2 = sc.nextLine();
		System.out.println("请输入第三个字符串验证码:");
		String s3 = sc.nextLine();

		arr.add(s1);
		arr.add(s2);
		arr.add(s3);

		BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
		for (int i = 0; i < arr.size(); i++) {
			String str = arr.get(i);
			bw.write(str);
			bw.newLine();
			bw.flush();

		}
		bw.close();
	}
}
