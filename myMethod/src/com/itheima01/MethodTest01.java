package com.itheima01;

import java.util.Scanner;

/*
 * ����¼���������ݣ��Ƚ����ֵ
 */
public class MethodTest01 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();

		// ���÷���
		int max = getMax(x, y);
		System.out.println("max:" + max);

	}
	/*
	 * ������ȷ��
	 * 			����ֵ���ͣ�int
	 * 			�����б�int a, int b
	 */
	public static int getMax(int a, int b) {
		
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
