package day04;

import java.util.Random;
import java.util.Scanner;

/*
 * 1. 完成猜数字小游戏
 * 
 * 分析： 1、首先获取一个随机数1-100之间
 * 		2、键盘录入一个猜测的数据
 * 		3、二者进行比较，判断是否猜中，对应给出提示
 * 		4、实现多次循环，直到猜中为止 ，结束
 */
public class Test01 {
	public static void main(String[] args) {

		// 1、首先获取一个随机数
		Random r = new Random();
		int num = r.nextInt(100) + 1;

		// 4、实现多次循环，直到猜中为止 ，结束
		while (true) {
			// 2、键盘录入一个猜测的数据
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要猜测的数据：");
			int guessNumber = sc.nextInt();

			// 3、二者进行比较，判断是否猜中，对应给出提示
			if (guessNumber > num) {
				System.out.println("你猜测的数据大了");
			} else if (guessNumber < num) {
				System.out.println("你猜测的数据小了");
			} else {
				System.out.println("恭喜你猜中了");
				break;
			}
		}
	}
}
