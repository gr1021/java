package com.itheima;
/*
 * 需求：打印5位数中的所有回文数。
 * 		什么是回文数呢?举例：12321是回文数，个位与万位相同，十位与千位相同。
 * 		
 * 		用方法实现
 */
public class Test03_1 {
	public static void main(String[] args) {
		for (int x = 10000; x < 100000; x++) {
			
			if (isHuiWen(x)) {
				System.out.println(x);
			}
		}
	}
	public static boolean isHuiWen(int x){
		int ge = x % 10;
		int shi =x / 10 % 10;
		int qian = x / 10 / 10 / 10 % 10;
		int wan = x / 10 / 10 / 10 / 10 % 10;
		
		if (ge == wan && shi == qian) {
			return true;
		}
		return false;
	}
}
