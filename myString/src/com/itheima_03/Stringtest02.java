package com.itheima_03;

import java.util.Scanner;

/*
 * ͳ��һ���ַ����еĴ�д��ĸ  Сд��ĸ  �Լ����ֵĸ���
 */
public class Stringtest02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();

		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= '0' && ch <= '9') {
				numberCount++;
			} else {
				System.out.println("���ַ�" + ch + "�Ƿ�");
			}
		}
		System.out.println("��д��ĸ������" + bigCount);
		System.out.println("Сд��ĸ������" + smallCount);
		System.out.println("���ָ�����" + numberCount);
	}
}
