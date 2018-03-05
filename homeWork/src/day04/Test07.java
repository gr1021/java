package day04;

/*
 * 7. 定义两个int类型的数组,把第一个数组的最大值和第二个数组的最小值进行互换,
 * 然后遍历两个数组(数组中不包含重复的元素)
 * 分析：1、定义两个int类型的数组
 * 		2、把第一个数组的最大值和第二个数组的最小值进行互换
 * 			获取第一个数组的最大值和第二个数组的最小值
 * 		3、然后遍历两个数组(数组中不包含重复的元素)
 */
public class Test07 {
	public static void main(String[] args) {
		// 1、定义两个int类型的数组
		int[] arr = { 12, 23, 34, 11, 25 };
		int[] arr2 = { 13, 14, 26, 35, 56 };

		int a = 0;
		int b = 0;
		// 获取第一个数组的最大值和第二个数组的最小值
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				a = i;
			}
		}
		int min = arr2[0];
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] < min) {
				min = arr2[i];
				b = i;
			}
		}
		// 把第一个数组的最大值和第二个数组的最小值进行互换
		int temp = max;
		max = min;
		min = temp;

		System.out.println("交换后的max是：" + max);
		System.out.println("交换后的min是：" + min);

		for (int i = 0; i < arr.length; i++) {
			arr[a] = max;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			arr2[b] = min;
			
			System.out.print(arr2[i]+" ");
		}
	}
}
