package com;

/*
 *  �����5λ���Ļ�������7λ���Ļ���������˶��ٸ�
 *  12321         1234321
 */
public class Test02 {
	public static void main(String[] args) {

	}

	// ��λ���Ļ�����
	public static void huiWenNum() {
		// �����ۼ���
		int count = 0;
		for (int i = 10000; i < 100000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int qian = i / 10 / 10 / 10 % 10;
			int wan = i / 10 / 10 / 10 / 10 % 10;
			if (ge == wan && shi == qian) {
				count++;
			}
		}
	}

	// ��λ���Ļ�����
	public static void huiWenNumber() {
		int count1 = 0;
		for (int i = 1000000; i < 10000000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			int qian = i / 10 / 10 / 10 % 10;
			int wan = i / 10 / 10 / 10 / 10 % 10;
		}
	}
}
