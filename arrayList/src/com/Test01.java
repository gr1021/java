package com;

import java.util.Random;

/*随机产生5个范围是[1,100]的整数,把这些数字中所有个位或十位为3的数字打印出来
 * 
 * 20 30 50 63 90
 * 30 63*/
public class Test01 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 10 == 3 || arr[i] / 10 % 10 == 3) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
