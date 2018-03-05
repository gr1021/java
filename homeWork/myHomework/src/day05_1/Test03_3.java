package day05_1;

/*
 * 5、定义一个方法copyOfRange(int[] arr, int from, int to),
 * 		功能：将数组arr中从索引from(包含from)开始到to结束(不包含to)的元素赋值到新数组中，
 *           并将新数组返回
 */
public class Test03_3 {
	public static void main(String[] args) {
		int[] arr = {12,23,14,25,34};
		
		copyOfRange(arr,2,4);
	}
	public static void copyOfRange(int[] arr, int from , int to){
		int[] arr1 = new int[6];
		for (int i = 0; i < arr.length; i++) {
			if (i >= from && i < to) {
				arr1[i] = arr[i];
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
