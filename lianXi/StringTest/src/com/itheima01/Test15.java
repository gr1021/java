package com.itheima01;
/*
 * StringBuilder��String���໥ת��
 * 
 * StringBuilder -- String
 * 		public String toString():ͨ��toString()�Ϳ���ʵ�ְ�StringBuilderת��String
 * 
 * String -- StringBuilder
 * 		StringBuilder(String str):ͨ�����췽���Ϳ���ʵ�ְ�Stringת��StringBuilder
 */
public class Test15 {
	public static void main(String[] args) {
		String s = "hello";
		String s2 = "world";
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println("sb:"+sb);
		
		sb.append("world").append(123);
		System.out.println("sb:"+sb);
		
	}
}
