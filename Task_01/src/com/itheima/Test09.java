package com.itheima;

import java.util.Scanner;

/*
 *  ���󣺼���¼������,Ҫ����������λ������,����Ҫ�����ݽ��м���,���ܹ�������:
 * ÿλ���ֶ�����5,Ȼ�����10���������������,
 * �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����,
 * ��Ѽ��ܺ���������������̨
 * 4567
 */
public class Test09 {
	public static void main(String[] args) {
		// ��������¼�� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ��(4λ����");
		int num = sc.nextInt();

		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[0] = num / 10 / 10 / 10 % 10;
			arr[1] = num / 10 / 10 % 10;
			arr[2] = num / 10 % 10;
			arr[3] = num % 10;
		}

		// ÿλ���ֶ�����5,Ȼ�����10���������������,
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 5;
			arr[i] %= 10;
		}

		// �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����,
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;

		temp = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;

		// ��Ѽ��ܺ���������������̨
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
