package day02;

import java.util.Scanner;

/*
 * 1. ����¼����������,�ж����������Ƿ����
 * A������
 * B������¼�����
 * C����������
 */
public class HomeWork01 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();

		boolean flag = (a == b);// boolean flag = (a == b)?true:false;
		System.out.println("flag:" + flag);
	}
}
