package com.itheima_03;

import java.util.Scanner;

/*
 * switch����ʽ��
 * 			switch(���ʽ) {
 * 				case ֵ1:
 * 					�����1;
 * 					break;
 *				 case ֵ2:
 * 					�����2;
 * 					break;
 * 				 case ֵ3:
 * 					�����3;
 * 					break;
 * 					......
 * 				default:
 * 					�����n + 1;
 * 					break;
 * }
 */
public class SwitchDemo01 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("����������(1-7)��");
		int weekday = sc.nextInt();

		switch (weekday) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("���������������");
			break;
		}

	}
}
