package com.itheima_02;

/*
 * ���󣺻�ȡ�����е���Сֵ)
 */
public class ArrayTest03 {
	public static void main(String[] args) {

		// ��������
		int[] arr = { 12, 34, 54, 21, 67, 22 };

		// ������
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			// �Ƚ�
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		// ���
		System.out.println("��Сֵ�ǣ�" + min);
	}
}
