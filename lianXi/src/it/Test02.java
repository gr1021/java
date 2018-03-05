package it;

import java.util.Scanner;

/*
 * 键盘录入两个数据，比较最大值
 * 分析：1、首先进行键盘录入数据
 * 		2、写一个获取最大值的方法
 * 		3、在方法中，写获取最大值的语句
 * 		4、在main方法中调用方法
 */
public class Test02 {
	public static void main(String[] args) {
		// 键盘录入数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		// 4、在main方法中调用方法
		int max = getMax(a, b);
		System.out.println("max:"+max);
	}

	// 2、写一个获取最大值的方法
	/*
	 * 两个明确：返回值类型：int 参数列表：int a, int b
	 */
	public static int getMax(int a, int b) {
		// 3、在方法中，写获取最大值的语句
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
