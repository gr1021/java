package com.itheima_06;

/*
 * do...while ����ʽ��
 * do{
 * 				ѭ�������;
 * 			}while(�ж��������);
 * 	��չ��ʽ��
 * ��ʼ�����;
 * 				do{
 * 				ѭ�������;
 * 				�����������;
 * 	}while(�ж��������);
 * ͳ��ˮ�ɻ������İ���
 */
public class DoWhileDemo02 {
	public static void main(String[] args) {
		// ����ͳ�Ʊ���
		int count = 0;
		// ��ʼ��ֵ
		int x = 100;
		do {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 100 % 10;
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == x) {
				count++;
				System.out.println(x);
			}
			x++;
		} while (x < 1000);
		System.out.println(count);
	}
}
