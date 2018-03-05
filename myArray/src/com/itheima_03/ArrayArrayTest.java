package com.itheima_03;

/*
 * 简化格式： 数据类型[][] 数组名 = {{元素...},{元素...},{元素...},...};
 */
public class ArrayArrayTest {
	public static void main(String[] args) {

		// 定义数组
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
