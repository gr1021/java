package com.itheima_03;

/*
 * 二维数组：就是元素为一维数组的数组。
 * 
 * 定义格式：数据类型[][] 数组名;
 *		动态初始化：
 *数据类型[][] 数组名 = new 数据类型[m][n];
 *		静态初始化：
 *简化格式： 数据类型[][] 数组名 = {{元素...},{元素...},{元素...},...};
 */
public class ArrayArrayDemo {
	public static void main(String[] args) {
		//定义二维数组
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		//输出
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][2]);
	}
}
