package day05;

/*
 * 4. 定义一个方法计算第一个数组中的最大值和第二个数组中的最小值的数据之和
 */
public class Test04 {
	public static void main(String[] args) {
		int[] arr = { 12, 23, 34, 11, 24 };
		int[] arr2 = { 15, 26, 12, 10, 24 };

		// 调用方法
		int sum = sum(arr, arr2);
		System.out.println("最大值和最小值的和是:" + sum);
	}

	public static int sum(int[] arr, int[] arr2) {
		// 定义最大值变量 获取最大值
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// 定义最小值变量 获取最小值
		int min = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] < min) {
				min = arr2[i];
			}
		}
		// 求最大值和最小值的和，并返回
		int sum = max + min;
		return sum;

	}
}
