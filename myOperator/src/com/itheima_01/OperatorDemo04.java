package com.itheima_01;
/*
 * ++  --�ȿ��Է��ڱ���ǰ��Ҳ�ɷ��ڱ�������
 * ++��ǰ�������������㣬++�ں�������������
 */
public class OperatorDemo04 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a:"+a);
		//++��ʹ��
		/*int x = a++;
		System.out.println("x:"+x);
		System.out.println("a:"+a);
		int y = ++a;
		System.out.println("y:"+y);
		System.out.println("a:"+a);*/
		
		//--��ʹ��
		int b = a--;
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		int x = --a;
		System.out.println("x:"+x);
		System.out.println("a:"+a);
		
	}
}
