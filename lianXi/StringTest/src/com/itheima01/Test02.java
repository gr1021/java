package com.itheima01;
/*
 *   ͨ�����췽���������ַ��������ֱ�Ӹ�ֵ��ʽ�������ַ���������ʲô������?
 * 		ͨ�����췽�������ַ����������ڶ��ڴ档
 * 		ֱ�Ӹ�ֵ��ʽ�����������ڷ������ĳ����ء�
 * 		
 * ==:
 * 		�����������ͣ��Ƚϵ��ǻ����������͵�ֵ�Ƿ���ͬ
 * 		�����������ͣ��Ƚϵ��������������͵ĵ�ֵַ�Ƿ���ͬ
 */
public class Test02 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		String s3 = "hello";
		System.out.println("s1==s2:"+(s1 ==s2));
		System.out.println("s1==s3:"+(s1 ==s3));
		System.out.println("s2==s3:"+(s2 ==s3));
		
		String s4 = "Hello";
		System.out.println("s3==s4:"+(s3==s4));
	}
}
