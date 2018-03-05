package it;

/*
 * 写一个方法，用于对数组进行求和，并调用方法。
 */
public class Test15 {
	public static void main(String[] args) {
		int[] arr = {12,23,45,11,15};
		int sum = sum(arr);
		System.out.println(sum);
	}
	public static int sum(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
