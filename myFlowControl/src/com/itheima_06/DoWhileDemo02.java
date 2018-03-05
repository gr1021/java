package com.itheima_06;

/*
 * do...while 语句格式：
 * do{
 * 				循环语句体;
 * 			}while(判断条件语句);
 * 	扩展格式：
 * 初始化语句;
 * 				do{
 * 				循环语句体;
 * 				控制条件语句;
 * 	}while(判断条件语句);
 * 统计水仙花个数的案例
 */
public class DoWhileDemo02 {
	public static void main(String[] args) {
		// 定义统计变量
		int count = 0;
		// 初始化值
		int x = 100;
		do {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 100 % 10;
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == x) {
				count++;
				System.out.println(x);
			}
			x++;
		} while (x < 1000);
		System.out.println(count);
	}
}
