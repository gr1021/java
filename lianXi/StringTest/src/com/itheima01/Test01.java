package com.itheima01;
/*
 *   String:�ַ�����
 * 		�ɶ���ַ���ɵ�һ������
 * 		�ַ����䱾����һ���ַ�����
 * 
 * ���췽����
 * 		String(String original):���ַ������ݷ�װ���ַ�������
 * 		String(char[] value):���ַ���������ݷ�װ���ַ�������
 * 		String(char[] value, int index, int count):���ַ������е�һ�������ݷ�װ���ַ�������
 * 
 * ע�⣺�ַ�����һ�ֱȽ�����������������ͣ�ֱ������ַ�������������Ǹö����е�����
 */
public class Test01 {
	public static void main(String[] args) {
		
		String s = new String();
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println("s:"+s);
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("--------------");
		
		char[] chs = {'h','e','l','l','o'};
		String s3 = new String(chs);
		System.out.println("s3:"+s3);
		System.out.println("-------------------");
		
		String s4 = new String(chs,1,3);
		System.out.println("s4:"+s4);
	}
}
