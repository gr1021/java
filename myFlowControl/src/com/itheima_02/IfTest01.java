package com.itheima_02;

import java.util.Scanner;

/*
 * ����¼���������ݣ�����������ݵ����ֵ
 */
public class IfTest01 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		// ��������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		/*if (a > b) {
			System.out.println("���ֵ�ǣ�"+ a);
		} else {
			System.out.println("���ֵ�ǣ�"+ b);
		}*/
		//Ϊ�˸��õ�ʹ�����Ĵ��ֵ
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("max :" + max);
	}
}
