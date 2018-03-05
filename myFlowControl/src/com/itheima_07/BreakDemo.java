package com.itheima_07;

/*
 * break:中断的意思
 * 
 * 使用场景：
 * 		A:switch语句中
 * 		B:循环中
 * 
 * 注意：
 * 		离开使用场景是没有意义的
 * 
 * 作用：
 * 		用于结束循环。
 */
public class BreakDemo {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("HelloWorld");
		}
	}
}
