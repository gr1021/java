package day05;

/*
 * 5. 定义一个方法获取数组中所有的元素之和
 */
public class Test05 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 1, 2, 3, 4, 5 };
		
		//调用
		int sum = sum(arr);
		System.out.println("sum:" + sum);
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
