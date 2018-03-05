package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
 * 1、首先获取一个随机数
 * 2、键盘录入一个猜测的数字
 * 3、二者之间作比较
 * 4、实现一直猜测，直到猜中为止，用while(true){循环体语句}实现
 */
public class RandomTest {
	public static void main(String[] args) {
		// 1、首先获取一个随机数
		// 创建对象
		Random r = new Random();
		// 获取数据 1-100
		int number = r.nextInt(100) + 1;
		while (true) {
			// 2、键盘录入一个猜测的数字
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要猜测的数据：");
			int guessNumber = sc.nextInt();

			// 3、二者之间作比较
			if (guessNumber > number) {
				System.out.println("你猜测的数据大了");
			} else if (guessNumber < number) {
				System.out.println("你猜测的数据小了");
			} else {
				System.out.println("恭喜你猜对了");
				break;
			}
		}
	}
}
