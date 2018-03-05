package com.itheima;

/*
 * 统计水仙花数的个数，用while循环实现
 * 首先获取水仙花数
 * 水仙花数是一个三位数，每个位上的数字立方和等于他本身
 */
public class Test03 {
	public static void main(String[] args) {

		int count = 0;
		int x = 100;
		while (x < 1000) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 100 % 10;
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == x) {
				count++;
				System.out.print(x + "  ");
			}
			x++;
		}
		System.out.println();
		System.out.println("count:"+count);

	}
}
