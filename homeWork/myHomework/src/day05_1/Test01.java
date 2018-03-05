package day05_1;

/*
 * 主方法中给定数组 int[] arr = {10,20,30,40,50,60};
 * 这个数组没有重复元素，定义一个方法可以接受这个给定的数组并返回这个数组中的最大元素值的索引值
 */
public class Test01 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {10,20,30,40,50,60};
		
		//调用方法
		int index = getMaxIndex(arr);
		System.out.println("最大元素值的索引值是:" + index);
	}
	public static int getMaxIndex(int[] arr){
		int max = arr[0];
		int x = 0;
		for ( int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				x = i;
			}
		}
		return x;
	}
}
