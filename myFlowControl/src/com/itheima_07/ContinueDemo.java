package com.itheima_07;

/*
 * continue:��������˼
 * 
 * ʹ�ó�����
 * 		ѭ����
 * 
 * ע�⣺
 * 		�뿪ʹ�ó�����û�������
 * 
 * ���ã�
 * 		����һ��ѭ��,������һ�ε�ѭ��
 */
public class ContinueDemo {
	public static void main(String[] args) {
		for (int i = 1; i < 8; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println("HelloWorld");
		}
	}
}
