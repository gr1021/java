package com.itheima01;
/*
 *  
 * StringBuilder:��һ���ɱ���ַ������ַ����������ࡣ
 * 
 * String��StringBuilder������
 * 		String�������ǹ̶��ġ�
 * 		StringBuilder�������ǿɱ�ġ�
 * 
 * ���췽����
 * 		StringBuilder()
 * 
 * ��Ա������
 * 		public int capacity():���ص�ǰ����   16
 * 		public int length():���س��ȣ��ַ�����
 * 
 * 		����������ֵ
 * 		���ȣ�ʵ��ֵ
 */
public class Test13 {
	public static void main(String[] args) {
		//��������
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("sb:"+sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}
