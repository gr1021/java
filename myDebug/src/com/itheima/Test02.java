package com.itheima;

import java.util.Scanner;

/*
 * ���󣺼���¼��һ���·ݣ�������·ݶ�Ӧ�ļ��ڡ�
 * 		һ�����ļ�
 * 		3,4,5	����
 * 		6,7,8	�ļ�
 * 		9,10,11	�＾
 * 		12,1,2	����
 * ��������switch���ʵ��  дһ������ʵ��
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·�");
		int month = sc.nextInt();

		String season = getSeason(month);
		System.out.println(season);

	}

	public static String getSeason(int month) {
		switch (month) {
		case 1:
		case 2:
		case 12:
			return "����";
		case 3:
		case 4:
		case 5:
			return "����";
		case 6:
		case 7:
		case 8:
			return "�ļ�";
		case 9:
		case 10:
		case 11:
			return "�＾";
		default:
			return "��������·�����";
		}
	}
}
