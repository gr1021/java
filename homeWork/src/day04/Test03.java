package day04;

/*
 * 3. 获取数组中的最大值
 * 
 * 分析：1、首先定义一个数组，并赋值
 * 		2、获取数组最大值
 */
public class Test03 {
	public static void main(String[] args) {
		// 1、首先定义一个数组，并赋值
		int[] arr = { 12, 23, 45, 24, 46 };

		// 2、获取数组最大值 先定义最大值变量
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("数组中最大值是：" + max);
	}
}
