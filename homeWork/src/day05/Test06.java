package day05;

/*
 * 6. 定义一个方法计算一个数组中所有的偶数元素之和
 */
public class Test06 {
	public static void main(String[] args) {
		// 首先定义一个数组
		int[] arr = { 1, 2, 4, 3, 5 };

		int sum = sum(arr);
		System.out.println("sum:" + sum);
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
}
