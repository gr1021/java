package com.itheima_06;

/*
 * do...while ����ʽ��
 * 				do{
 * 				ѭ�������;
 * 			}while(�ж��������);
 * 	��չ��ʽ��
 * 				��ʼ�����;
 * 				do{
 * 				ѭ�������;
 * 				�����������;
 * 	}while(�ж��������);
 * ��Ͱ��� 1-10
 * 
 */
public class DoWhileDemo01 {
	public static void main(String[] args) {
		// ������ͱ���
		int sum = 0;
		// ��ʼ�����
		int x = 1;
		do {
			sum += x;
			x++;
		} while (x <= 10);
		System.out.println(sum);
	}
}
