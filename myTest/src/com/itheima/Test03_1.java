package com.itheima;
/*
 * ���󣺴�ӡ5λ���е����л�������
 * 		ʲô�ǻ�������?������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 * 		
 * 		�÷���ʵ��
 */
public class Test03_1 {
	public static void main(String[] args) {
		for (int x = 10000; x < 100000; x++) {
			
			if (isHuiWen(x)) {
				System.out.println(x);
			}
		}
	}
	public static boolean isHuiWen(int x){
		int ge = x % 10;
		int shi =x / 10 % 10;
		int qian = x / 10 / 10 / 10 % 10;
		int wan = x / 10 / 10 / 10 / 10 % 10;
		
		if (ge == wan && shi == qian) {
			return true;
		}
		return false;
	}
}
