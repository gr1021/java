package com.itheima_05;
/*
 * ��Ԫ�������
 * 			��ϵ���ʽ�����ʽ1�����ʽ2
 * ִ�����̣������ϵ���ʽ��ֵ,����true����false
 * 			�����true�����ʽ1 �ǽ��
 * 			�����false�����ʽ2 �ǽ��
 */
public class OperatorDemo01 {
	public static void main(String[] args) {
		//�������
		int a = 10;
		int b = 20;
		
		int c = (a > b)?a:b;
		System.out.println("c:"+c);
	}
}
