package com.itheima;
/*
 * �����������+��-��*��/�� %��++��--
 */
public class OperatorLx01 {
	public static void main(String[] args) {
		// �������
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println("-----------------------------");
		//���䣺���ַ����ַ������мӷ�����
		// ���ַ����
		int y = 'a';//'a' :97
		System.out.println(a + y);
		System.out.println("----------------------------");
		
		//���ַ�����ӣ���ʵ�����ַ�������ƴ��
		String aa = "Hello";
		System.out.println(aa + a + b);
		System.out.println(a + b + aa );
		System.out.println("----------------------------");
		
		
		//ע�� / ��  % ������%�������������ʱ��������/�������������ʱ����
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println("------------------------------");
		//++:�������㣬���ڱ���ǰ�棬�����������㣻���ڱ������棬�����㣬������
		/*int c = a++;
		System.out.println(c);
		int x = ++b;
		System.out.println(b);
		System.out.println("------------------------------");*/
		//--:�Լ����㣬���ڱ���ǰ�棬���Լ������㣻���ڱ������棬�����㣬���Լ�
		int c = a--;
		System.out.println(c);
		int x = --a;
		System.out.println(x);
	}
}
