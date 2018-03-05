package it;

/*
 * 把获取数组最值改进为方法实现，并调用方法
 */
public class Test13 {
	public static void main(String[] args) {
		int[] arr = { 12, 23, 43, 11, 32 };
		int max = getMax(arr);
		System.out.println(max);
	}
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
