package com.itheima01;

/*
 * ȥ���ַ������˿ո�	
 *		String trim()
 * ����ָ�����ŷָ��ַ���	
 *		String[] split(String str)
 */
public class Test10 {
	public static void main(String[] args) {
		String s1 = "  helloWorld  ";
		String s2 = " hello world ";
		String s3 = "aa.bb.cc";

		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println("----------------------");
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println("-----------------------------");

		String[] str = s3.split("\\.");//�á�.���и��Ϊ��.����ͨ�������Ҫ���Ϸ�б��
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
