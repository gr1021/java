package com.itheima_05;
/*
 * 把数组中的数据按照指定个格式拼接成一个字符串
 * 举例：int[] arr = {1,2,3};	
 * 输出结果：[1, 2, 3]
 */
public class StringTest {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		
		String s = arrayToString(arr);
		System.out.println("s:"+s);
		
	}
	public static String arrayToString(int[] arr){
		String s = "";
		
		s += "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				s += arr[i];
			}else{
				s += arr[i];
				s += ",";
			}
		}
		s += "]";
		
		
		return s;
	}
}
