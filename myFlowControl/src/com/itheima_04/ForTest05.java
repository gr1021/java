package com.itheima_04;

/*
 * ��ӡˮ�ɻ�����ˮ�ɻ�����ָһ����λ������ÿ��λ�ϵ����ֵ������͵����䱾��
 * ���Ƚ��л�ȡ��λ��ʮλ����λ�ϵ�����
 */
public class ForTest05 {
	public static void main(String[] args) {

		    // ˮ�ɻ�����ָһ����λ��
		for (int i = 100; i < 1000; i++) {
			// ��ȡ��λ�ϵ�����
			int a = i % 10;
			// ��ȡʮλ�ϵ�����
			int b = i / 10 % 10;
			// ��ȡ��λ�ϵ�����
			int c = i / 100 % 10;
			
			// ��ÿ��λ�ϵ����ֵ������͵����䱾��
			if (a*a*a +  b*b*b + c*c*c == i) {
				System.out.println(i);
			}
		}
	}
}
