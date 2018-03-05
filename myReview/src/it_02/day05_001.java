package it_02;
/*
 * 主方法中给定数组 int[] arr= {10,20,30,40,50,60};这个数组没有重复元素.定义一个方法可
以接受这个给定的数组并返回这个数组中最大元素值的索引值 
 */
public class day05_001 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60};
		
		int index = getIndex(arr);
		System.out.println("index:"+index);
	}
	public static int getIndex(int[] arr){
		
		int max = arr[0];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
}
