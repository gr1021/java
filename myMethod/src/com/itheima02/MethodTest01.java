package com.itheima02;

/*
 * дһ������������һ������(����1)���ڿ���̨��ӡ1�������ݵ�ֵ
 * 
 */
public class MethodTest01 {
	public static void main(String[] args) {
		
		//���÷���
		printNumber(3);
		System.out.println("--------------");
		printNumber(4);
		System.out.println("--------------");
		printNumber(5);
	}
	public static void printNumber(int n){
		for (int i = 1; i < n; i++) {
			System.out.println(i);
		}
	}
}
