package com.itheima;

import java.util.Scanner;

/*
 * ��������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
 *(1)��������int[] arr = {5,7,3,2,5};
 *(2)Ҫ��ѯ��Ԫ��ͨ������¼��ķ�ʽȷ��
 *(3)����һ����������Ԫ�ص�һ�γ���λ�õķ���(ע,Ҫ���ҵ�Ԫ�ؾ��Ǽ���¼�������)
 *
 */
public class Test08 {
	public static void main(String[] args) {
		//��������
		int[] arr = {5,7,3,2,5};
		
		//����¼��Ҫ���ҵ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ѯ��Ԫ��:");
		int x = sc.nextInt();
		
		
		int index = getNum(arr,x);
		System.out.println("index:"+index);
		
	}
	public static int getNum(int[] arr,int value){
		
		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
					return i;
			}
		}
		return -1;
	}
}
