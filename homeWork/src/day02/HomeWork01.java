package day02;

import java.util.Scanner;

/*
 * 1. 键盘录入两个数据,判断两个数据是否相等
 * A、导包
 * B、键盘录入对象
 * C、接收数据
 */
public class HomeWork01 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		boolean flag = (a == b);// boolean flag = (a == b)?true:false;
		System.out.println("flag:" + flag);
	}
}
