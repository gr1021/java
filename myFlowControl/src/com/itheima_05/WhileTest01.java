package com.itheima_05;

/*
 * ͳ��ˮ�ɻ����ĸ�������whileѭ��ʵ��
 * ���Ȼ�ȡˮ�ɻ���
 * ˮ�ɻ�����һ����λ����ÿ��λ�ϵ����������͵���������
 */
public class WhileTest01 {
	public static void main(String[] args) {
		// ����ͳ�Ʊ���
		int count = 0;
		// �����ʼ��ֵ
		int x = 100;
		// �ж��������ʽ
		while (x < 1000) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 100 % 10;
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == x) {
				count++;
				System.out.println(x);
			}
			x++;
		}
		System.out.println("count:" + count);
	}
}
