package it;
/*
 * 主方法中给定数组 int[] arr= {10,20,30,40,50,60};定义一个方法可以接受这个给定的数组 
并返回这个数组中元素的最小值 
 */
public class day05_04 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {10,20,30,40,50,60};
		
		//调用方法
		 getMin(arr);
		
	}
	public static void getMin(int[] arr){
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min:"+min);
	}
}
