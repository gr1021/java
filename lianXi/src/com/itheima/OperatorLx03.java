package com.itheima;

/*
 * ��ϵ�������== ,!=, >, >=, < ,<=
 * ��ϵ������Ľ����boolean����
 */
public class OperatorLx03 {
	public static void main(String[] args) {
		// �������
		int a = 3;
		int b = 4;
		int c = 3;
		// == , !=
		System.out.println(a == b);// false
		System.out.println(a != b);// true
		System.out.println(a == c);// true
		// < ,<=
		System.out.println(a < b);// true
		System.out.println(a <= b);// true
		System.out.println(a <= c);// true
		// > ,>=
		System.out.println(a > b);// false
		System.out.println(a > c);// false
		System.out.println(a >= c);// true

	}

}
