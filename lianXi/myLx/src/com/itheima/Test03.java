package com.itheima;

/*
 * ͳ��ˮ�ɻ����ĸ�������whileѭ��ʵ��
 * ���Ȼ�ȡˮ�ɻ���
 * ˮ�ɻ�����һ����λ����ÿ��λ�ϵ����������͵���������
 */
public class Test03 {
	public static void main(String[] args) {

		int count = 0;
		int x = 100;
		while (x < 1000) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 100 % 10;
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == x) {
				count++;
				System.out.print(x + "  ");
			}
			x++;
		}
		System.out.println();
		System.out.println("count:"+count);

	}
}
