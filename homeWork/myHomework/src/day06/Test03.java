package day06;

/*
 * 定义一个方法,求出给定的数字在给定 int 型数组中出现的次数,如果一次没有出现则返
 *回 0。
 *如:给定数字 3 求出 3 在数组 int[] arr = {3,4,3,5,7,9};中出现的次数 
 */
public class Test03 {
	public static void main(String[] args) {
		// 调用一个int类型的数组
		int[] arr = { 3, 4, 3, 5, 7, 9 };

		// 调用方法
		getCount(arr, 2);

	}

	public static int getCount(int[] arr, int value) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				count++;
			}
		}
		System.out.println("count:"+count);
		return 0;
	}
}
