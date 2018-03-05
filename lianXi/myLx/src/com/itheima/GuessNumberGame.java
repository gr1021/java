package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字游戏  首先获取一个随机数  然后键盘录入数据  最后进行比较 看是否能猜中
 */
public class GuessNumberGame {
	public static void main(String[] args) {
		// 创建随机数对象
		Random r = new Random();
		// 获取数据
		int number = r.nextInt(100) + 1;

		while (true) {
			// 创建键盘录入对象
			Scanner sc = new Scanner(System.in);

			// 接收数据
			System.out.println("请输入你要猜测的数据：");
			int guessNumber = sc.nextInt();

			// 二者之间作比较
			if (guessNumber > number) {
				System.out.println("你输入的数据大了");
			} else if (guessNumber < number) {
				System.out.println("你输入的数据小了");
			} else {
				System.out.println("恭喜你猜对了");
				break;
			}
		}
	}
}
