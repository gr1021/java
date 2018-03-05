package day04;

/*
 * 6. 把一个数组中的最大值和最小值进行互换
 * 分析：1、定义数组
 * 		2、求出数组最大值和最小值
 * 		3、交换最大值，最小值
 */
public class Test06 {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 12, 34, 54, 21, 32 };

		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int temp = max;
		max = min;
		min = temp;
		System.out.println("交换后的最大值是:"+max);
		System.out.println("交换后的最小值是:"+min);
		
		
		
	}
}
