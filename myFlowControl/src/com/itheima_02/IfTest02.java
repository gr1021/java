package com.itheima_02;

import java.util.Scanner;

/*
 * ����¼��ɼ����ɼ���90����100֮������"����";80-90����"��";
 * 70-80����"��";60-70����"����";
 */
public class IfTest02 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("������ɼ���");
		int a = sc.nextInt();

		if (a >= 90 && a < 100) {
			System.out.println("����");
		} else if (a >= 80 && a < 90) {
			System.out.println("��");
		} else if (a >= 70 && a < 80) {
			System.out.println("��");
		} else if (a >= 60 && a < 70) {
			System.out.println("����");
		} else if (a >= 0 && a < 60) {
			System.out.println("������");
		} else {
			System.out.println("������ĳɼ�����");
		}
	}
}
