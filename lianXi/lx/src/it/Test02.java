package it;

import java.util.Scanner;

/*
 * ����¼���������ݣ��Ƚ����ֵ
 * ������1�����Ƚ��м���¼������
 * 		2��дһ����ȡ���ֵ�ķ���
 * 		3���ڷ����У�д��ȡ���ֵ�����
 * 		4����main�����е��÷���
 */
public class Test02 {
	public static void main(String[] args) {
		// ����¼������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();

		// 4����main�����е��÷���
		int max = getMax(a, b);
		System.out.println("max:"+max);
	}

	// 2��дһ����ȡ���ֵ�ķ���
	/*
	 * ������ȷ������ֵ���ͣ�int �����б�int a, int b
	 */
	public static int getMax(int a, int b) {
		// 3���ڷ����У�д��ȡ���ֵ�����
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
