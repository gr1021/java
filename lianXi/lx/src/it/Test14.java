package it;

/*
 * 利用方法获取数组最小值的练习。
 */
public class Test14 {
	public static void main(String[] args) {
		int[] arr= {12,23,43,11,33};
		
		int min = getMin(arr);
		System.out.println(min);
	}
	public static int getMin(int[] arr){
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
