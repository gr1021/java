package day04;

import java.util.Random;

/*
 * 2. 随机获取数组中的一个值
 * 
 * 分析： 1、定义一个数组
 * 	    2、获取一个随机数，范围与数组长度一致
 * 		3、输出随机获取到的数组的值
 */
public class Test02 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 12, 14, 13, 23, 34 };

		Random r = new Random();
		int i = r.nextInt(arr.length);

		System.out.println(arr[i]);
	}
}
