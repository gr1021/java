package com;

/*
 * 6. ��һ�������е����ֵ����Сֵ���л���
 * ������1����������
 * 		2������������ֵ����Сֵ
 * 		3���������ֵ����Сֵ
 */
public class Test02 {
	public static void main(String[] args) {
		int[] arr = {12,14,23,43,11};
		
		int max = arr[0];
		int min = arr[0];
		int a = 0;
		int b = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max ) {
				max = arr[i];
				a = i;
			}
			if (arr[i] < min ) {
				min =arr[i];
				b = i;
			}
		}
		
		int temp = max;
		max = min;
		min = temp;
		
		arr[a] = max;
		arr[b] = min;
		System.out.println("����������ֵ�ǣ�" + max);
		System.out.println("���������Сֵ�ǣ�" + min);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
