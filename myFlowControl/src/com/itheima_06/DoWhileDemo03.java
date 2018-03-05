package com.itheima_06;

/*
 * for while 与do...while 的区别
 * 1、do...while至少执行一次循环体; 而for和while则要根据判断条件来进行执行
 * 2、for循环结束后,初始化的变量就不能被使用了。而while循环结束后,初始化的变量还可以继续使用。
 * 
 */
public class DoWhileDemo03 {
	public static void main(String[] args) {

		// while循环语句
		int x = 3;
		while (x < 3) {
			System.out.println("好好学习，天天向上");
		}
		System.out.println("--------------------------");

		// do...while 循环语句
		int y = 5;
		do {
			System.out.println("好好学习，天天向上");
			y++;
		} while (y < 5);// 即使条件不成立，也会打印一遍
		System.out.println("--------------------------");

		// for循环语句与while语句的区别
		for (int i = 1; i < 5; i++) {
			System.out.println("好好学习，天天向上");
		}
		// System.out.println(i);//报错，因为超出了i的使用范围
		System.out.println("--------------------------");

		int j = 3;
		while (j < 6) {
			System.out.println("好好学习，天天向上");
			j++;
		}
		System.out.println(j);
	}
}
