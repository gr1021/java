package com.itheima_04;

/*
 * ��1-100֮���ż���� 
 * ����Ҫ�Ȼ�ȡ1-100֮������ݣ�Ȼ�����ж��Ƿ���ż����������
 */
public class ForTest04 {
	public static void main(String[] args) {
		// ������ͱ���
		int sum = 0;

		// ��ȡ1-100֮������ݣ���forѭ��ʵ��
		for (int i = 1; i <= 100; i++) {
			// ��ȡ���������ж��Ƿ���ż��
			if (i % 2 == 0) {
				// ��ȡ����ż�����
				sum += i;
			}
		}
		// �����
		System.out.println("sum:" + sum);
	}
}
