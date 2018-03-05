package com.itheima;

/*
 * 需求：打印5位数中的所有回文数。
 * 		什么是回文数呢?举例：12321是回文数，个位与万位相同，十位与千位相同。
 * 		
 * 		用方法实现
 * 		
 */
public class Test03 {
	public static void main(String[] args) {
		 print();
		 //System.out.println();
	}

	public static void print() {
		for (int i = 10000; i < 100000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int qian = i / 10 / 10 / 10 % 10;
			int wan = i / 10 / 10 / 10 / 10 % 10;
			
			if (ge == wan && shi == qian) {
				System.out.println(i+" ");
			}
		}
	}
}
