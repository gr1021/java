package com.itheima_05;

/*
 * ��whileѭ��ʵ�ִ�ӡ1-100֮��ĺ�
 */
public class WhileDemo01 {
	public static void main(String[] args) {
		int sum = 0;
		// ��ʼ��ֵ
		int x = 1;

		// �ж��������ʽ
		while (x <= 100) {
			sum += x;
			x++;
		}
		System.out.println(sum);
	}

}
