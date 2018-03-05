package com.itheima_04;

/*
 * 打印水仙花数，水仙花数是指一个三位数，其每个位上的数字的立方和等于其本身
 * 首先进行获取个位，十位，百位上的数字
 */
public class ForTest05 {
	public static void main(String[] args) {

		    // 水仙花数是指一个三位数
		for (int i = 100; i < 1000; i++) {
			// 获取个位上的数字
			int a = i % 10;
			// 获取十位上的数字
			int b = i / 10 % 10;
			// 获取百位上的数字
			int c = i / 100 % 10;
			
			// 其每个位上的数字的立方和等于其本身
			if (a*a*a +  b*b*b + c*c*c == i) {
				System.out.println(i);
			}
		}
	}
}
