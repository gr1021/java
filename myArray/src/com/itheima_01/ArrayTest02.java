package com.itheima_01;

/*
 * ���󣺶����������飬�ֱ������������Ԫ�ء�
 * Ȼ��ֱ�������е�Ԫ�ظ�ֵ���ֱ��ٴ������������Ԫ�ء�
 */
public class ArrayTest02 {
	public static void main(String[] args) {
		// �����������飬�ֱ������������Ԫ�ء�
		int[] arr1 = new int[3];
		int[] arr2 = new int[2];

		// �ֱ������������Ԫ�ء�
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);

		// Ȼ��ֱ�������е�Ԫ�ظ�ֵ���ֱ��ٴ������������Ԫ�ء�
		arr1[0] = 10;
		arr2[1] = 30;

		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);

	}
}
