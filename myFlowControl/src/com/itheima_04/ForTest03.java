package com.itheima_04;

/*
 * 求1-5数据之和
 */
public class ForTest03 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println("sum:" + sum);
	}
}
