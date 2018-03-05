package day04;

/*
 * 5. 计算一维数组中最大值和最小值的数据之和
 * 分析：1、定义一个一维数组
 * 		2、求出数组最大值和最小值
 * 		3、将最大值和最小值相加
 */
public class Test05 {
	public static void main(String[] args) {
		// 定义一个一维数组
		int[] arr = { 12, 34, 25, 11, 45 };

		// 求出数组最大值和最小值
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int sum = max + min;
		System.out.println("最大值和最小值相加的和是：" + sum);
	}
}
