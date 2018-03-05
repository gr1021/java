package day05;

import java.util.Random;

/*
 * 随机产生两个整数，随机数的范围均是[1,100] ,
 * 定义方法求这两个整数的和并打印和值
 */
public class Test02 {
	public static void main(String[] args) {
		// 获取随机数
		Random r = new Random();
		int a = r.nextInt(100) + 1;
		int b = r.nextInt(100) + 1;

		System.out.println("a:" + a);
		System.out.println("b:" + b);

		int sum = sum(a, b);
		System.out.println("sum:" + sum);
	}

	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}
}
