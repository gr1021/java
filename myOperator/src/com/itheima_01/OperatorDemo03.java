package com.itheima_01;
/*
 * +: �ӷ�����
 * 
 * ���ַ����мӷ�����
 * 'A' 65
 * 'a' 97
 * '0' 48
 * ���ַ�����ӣ�������ƴ��
 */
public class OperatorDemo03 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a + b);
		System.out.println("-----------------");
	    //���ַ����мӷ�����
		char x = 'a';
		System.out.println(a + x);
		//���ַ������мӷ�����ʱ����ƴ������
		String  y = "hello";
		System.out.println(y+a);//hello10
		System.out.println(y+a+b);//hello1020
		System.out.println(a+b+y);//30hello
		
	}
}
