package com.itheima_06;
/*
 * 把数组拼接成一个字符串
 * 举例 ： int[] arr = {1,2,3};
 * 
 * 	结果：  [1,2,3]
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		
		String ss = arrayToString(arr);
		System.out.println("ss:"+ss);
	}
	public static String arrayToString(int[] arr){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				sb.append(arr[i]);
			}else{
				sb.append(arr[i]).append(",");
			}
		}
		sb.append("]");
		String result = sb.toString();
		return result;
	}
}
