package com.itheima;

import java.util.Scanner;

/*
 * ���󣺴�ӡ5λ���е����л�������
 * 		ʲô�ǻ�������?������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 * 		
 * 		�÷���ʵ��
 */
public class Test02 {
	public static void main(String[] args) {
		
			printHuiWenNum();
	}

	public static void printHuiWenNum() {
		for (int x = 10000; x < 100000; x++) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int qian = x / 10 / 10 / 10 % 10;
			int wan = x / 10 / 10 / 10 / 10 % 10;
			if (ge == wan && shi == qian) {
				System.out.println(x);
			}
		}
	}
}
