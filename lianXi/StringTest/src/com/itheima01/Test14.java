package com.itheima01;
/*
 * ��ӹ���
 *		public StringBuilder append(��������):������ݣ��������������
 * ��ת����
 *		public StringBuilder reverse()
 */
public class Test14 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("world");
		System.out.println("sb:"+sb);
		
		sb.reverse();
		System.out.println("sb:"+sb);
		
		sb.reverse();
		System.out.println("sb:"+sb);
		
		sb.append(123);
		System.out.println("sb:"+sb);
	}
}
