package com.itheima;

import java.util.Scanner;

/*
 * ��������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
 *(1)��������int[] arr = {5,7,3,2,5};
 *(2)Ҫ��ѯ��Ԫ��ͨ������¼��ķ�ʽȷ��
 *(3)����һ����������Ԫ�ص�һ�γ���λ�õķ���(ע,Ҫ���ҵ�Ԫ�ؾ��Ǽ���¼�������)
 */
public class Test07 {
	public static void main(String[] args) {

		// ��������
		int[] arr = { 5, 7, 3, 2, 5 };

		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ѯ�����ݣ�");
		int num = sc.nextInt();

		int index = find(arr, num);
		System.out.println(index);
	}

	public static int find(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
