package com.itheima;

/*
 * ���󣺴�ӡ5λ���е����л�������
 * 		ʲô�ǻ�������?������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 * 		
 * 		�÷���ʵ��
 * 		
 */
public class Test03 {
	public static void main(String[] args) {
		 print();
		 //System.out.println();
	}

	public static void print() {
		for (int i = 10000; i < 100000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int qian = i / 10 / 10 / 10 % 10;
			int wan = i / 10 / 10 / 10 / 10 % 10;
			
			if (ge == wan && shi == qian) {
				System.out.println(i+" ");
			}
		}
	}
}
