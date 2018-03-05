package day04;

/*
 * 4. 遍历一维数组
 * 
 * 分析：1、先定义一个数组
 * 	   2、通过for循环遍历数组
 */
public class Test04 {
	public static void main(String[] args) {
		// 1、先定义一个数组
		int[] arr = { 12, 34, 25, 45, 32, 11 };

		// 通过for循环遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
