package com.itheima_04;
/*
 * ��ӡˮ�ɻ�����ͳ��ˮ�ɻ����ĸ�����ˮ�ɻ�����ָһ����λ������ÿ��λ�ϵ����ֵ������͵����䱾��
 * ���Ƚ��л�ȡ��λ��ʮλ����λ�ϵ�����
 */
public class ForTest06 {
	public static void main(String[] args) {
		
		int count = 0;
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
				count ++;
				System.out.print(i+",");
			}
		}
		System.out.println();
		System.out.println("count:"+count);
	 }
}
