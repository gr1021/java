package com.itheima_07;

/*
 * break:�жϵ���˼
 * 
 * ʹ�ó�����
 * 		A:switch�����
 * 		B:ѭ����
 * 
 * ע�⣺
 * 		�뿪ʹ�ó�����û�������
 * 
 * ���ã�
 * 		���ڽ���ѭ����
 */
public class BreakDemo {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("HelloWorld");
		}
	}
}
