package com.itheima_04;
/*
 * �߼������: �������ӹ�ϵ���ʽ
 * 			& �� | �� ��^ , !
 * 			&& , ||
 * &:��false��false
 * |�� ��true��true
 * ^�� ��ͬΪfalse����ͬΪtrue
 * !����true��false����false��true
 */
public class OperatorDemo01 {
	public static void main(String[] args) {
		//�������
		int a = 3;
		int b = 4;
		int c = 5;
		
		//&
		System.out.println((a>b) & (a>c));//false & false
		System.out.println((a>b) & (a<c));//false & true
		System.out.println((a<b) & (a>c));//true & false
		System.out.println((a<b) & (a<c));//true & true
		System.out.println("-------------------------------");
		//|
		System.out.println((a>b) | (a>c));//false | false
		System.out.println((a>b) | (a<c));//false | true
		System.out.println((a<b) | (a>c));//true | false
		System.out.println((a<b) | (a<c));//true | true
		System.out.println("-------------------------------");
		// ^
		System.out.println((a>b) ^ (a>c));//false ^ false
		System.out.println((a>b) ^ (a<c));//false ^ true
		System.out.println((a<b) ^ (a>c));//true ^ false
		System.out.println((a<b) ^ (a<c));//true ^ true
		System.out.println("-------------------------------");
		// !
		System.out.println(!(a>b));// !false 
		System.out.println(!(a<b));// !true 
		System.out.println("-------------------------------");
		
	}
	
}
