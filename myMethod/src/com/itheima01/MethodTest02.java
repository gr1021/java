package com.itheima01;

import java.util.Scanner;

/*
 * ����¼���������ݣ��ж��Ƿ����
 */
public class MethodTest02 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();

		boolean b = compare(x, y);
		System.out.println(b);
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�boolean �����б�int a, int b
	 */
	public static boolean compare(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}
}
