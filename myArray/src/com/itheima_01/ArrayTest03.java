package com.itheima_01;

/*
 * ���󣺶����������飬�ȶ���һ�����飬��ֵ�������Ȼ����ڶ��������ʱ��ѵ�һ������ĵ�ַ��ֵ���ڶ������顣
 * Ȼ����ڶ������鸳ֵ���ٴ�����������������Ԫ�ء�
 */
public class ArrayTest03 {
	public static void main(String[] args) {
		//�ȶ���һ������
		int[] arr1 = new int[3];
		
		//��ֵ
		arr1[0] = 10;
		arr1[1] = 11;
		arr1[2] = 12;
		
		//���
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		//Ȼ����ڶ��������ʱ��ѵ�һ������ĵ�ַ��ֵ���ڶ�������
		int[] arr2 = arr1;
		
		//Ȼ����ڶ������鸳ֵ
		arr2[0] = 3;
		arr2[1] = 4;
		arr2[2] = 5;
		
		//�ٴ�����������������Ԫ��
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		//arr2����
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
	}
}
