package com;

/*
 * 7. ��������int���͵�����,�ѵ�һ����������ֵ�͵ڶ����������Сֵ���л���,
 * Ȼ�������������(�����в������ظ���Ԫ��)
 * ������1����������int���͵�����
 * 		2���ѵ�һ����������ֵ�͵ڶ����������Сֵ���л���
 * 			��ȡ��һ����������ֵ�͵ڶ����������Сֵ
 * 		3��Ȼ�������������(�����в������ظ���Ԫ��)
 */
public class Test01 {
	public static void main(String[] args) {
		// ��������int���͵�����
		int[] arr = { 12, 13, 24, 23, 25 };
		int[] arr2 = { 11, 34, 25, 26, 45 };

		// �ѵ�һ����������ֵ�͵ڶ����������Сֵ���л���,
		int a = 0;
		int b = 0;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];// max = 25
				a = i;// a=4
			}
		}

		int min = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] < min) {
				min = arr2[i];// min = 11
				b = i;// b=0
			}
		}

		int temp = max;
		max = min;
		min = temp;// max = 11,min = 25

		// System.out.println("max:"+max);
		// System.out.println("min:"+min);

		arr[a] = max;
		arr2[b] = min;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
