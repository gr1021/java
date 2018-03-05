package day05_1;

/*
 * 4、定义一个方法copyOf(int[] arr,int newLength),
 * 		功能：将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引0开始
 * 
 * 
 */
public class Test03_2 {
	public static void main(String[] args) {

		// 定义数组
		int[] arr = { 12, 23, 34, 11, 13 };
		copyOf(arr, 4);

	}

	public static void copyOf(int[] arr, int newLength) {
		int[] arr1 = new int[6];
		for (int i = 0; i < arr.length; i++) {
			if (i >= 0 && i < newLength) {
				arr1[i] = arr[i];
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}
}
