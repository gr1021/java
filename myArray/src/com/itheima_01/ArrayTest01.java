package com.itheima_01;

/*
 * ���󣺶���һ�����飬�����������Ԫ�ء�
 * Ȼ��������е�Ԫ�ظ�ֵ���ٴ������������Ԫ�ء�
 */
public class ArrayTest01 {
	public static void main(String[] args) {

		// ����һ������
		int[] arr = new int[3];

		// �����������Ԫ��
		System.out.println("arr:" + arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// Ȼ��������е�Ԫ�ظ�ֵ
		arr[0] = 10;
		arr[2] = 20;

		// �ٴ������������Ԫ��
		System.out.println("arr:" + arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
