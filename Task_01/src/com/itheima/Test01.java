package com.itheima;

import java.util.Scanner;

/*
 * ���󣺼���¼��һ���·ݣ�������·ݶ�Ӧ�ļ��ڡ�
 * 		һ�����ļ�
 * 		3,4,5	����
 * 		6,7,8	�ļ�
 * 		9,10,11	�＾
 * 		12,1,2	����
 * ������
 * 		��if���ʵ��
 * 		1������¼������
 * 		2��дһ������ʵ��
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���·����ݣ�");
		int month = sc.nextInt();
		
		String season = printSeason(month);
		System.out.println(season);
	}
	public static String printSeason(int month){
		if (month == 1 || month ==2 || month == 12) {
			return "����";
		}else if (month >= 3 && month <=5) {
			return "����";
		}else if (month >= 6 && month <=8) {
			return "�ļ�";
		}else if (month >= 9 && month <=11) {
			return "�＾";
		}else{
			return "��������·ݲ�����";
		}
	}
}
