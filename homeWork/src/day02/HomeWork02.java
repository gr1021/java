package day02;

import java.util.Scanner;

/*
 * 2. 键盘录入三个数据,获取三个数据中的最大值
 */
public class HomeWork02 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		System.out.println("请输入第三个数据：");
		int c = sc.nextInt();

		int temp = (a > b) ? a : b;
		int max = (temp > c) ? temp : c;
		System.out.println("max:" + max);
	}
}
