package com.itheima05;

/*
 * ���÷�����ȡ��Сֵ����ϰ��
 */
public class MethodTest03 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 12, 23, 44, 11, 34 };
		// ��������
		int min = getMin(arr);
		System.out.println("min:" + min);
	}

	// ����Сֵ����
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
