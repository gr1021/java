package day05_1;

/*
 * 3、定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)
 * 		功能:将数组arr中的元素从索引fromInde开始到toIndex(不包含toIndex)对应的值改为value
 */
public class Test03_1 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = new int[8];

		// 调用方法
		fill(arr, 2, 6, 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void fill(int[] arr, int fromIndex, int toIndex, int value) {

		for (int i = 0; i < arr.length; i++) {
			if (i >= fromIndex && i < toIndex) {
				arr[i] = value;
			}
		}
	}
}
