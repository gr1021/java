package com.itheima_07;

/*
 * continue:继续的意思
 * 
 * 使用场景：
 * 		循环中
 * 
 * 注意：
 * 		离开使用场景是没有意义的
 * 
 * 作用：
 * 		结束一次循环,继续下一次的循环
 */
public class ContinueDemo {
	public static void main(String[] args) {
		for (int i = 1; i < 8; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println("HelloWorld");
		}
	}
}
