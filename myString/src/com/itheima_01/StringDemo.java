package com.itheima_01;

/*
 * 
 */
public class StringDemo {
	public static void main(String[] args) {

		String s1 = new String("helloWorld");
		System.out.println("s1:"+s1);
		System.out.println("------------------------------");

		char[] chs = { 'h', 'e', 'l', 'l', 'o' };
		String s2 = new String(chs);
		System.out.println("s2:"+s2);
		System.out.println("------------------------------");
		
		char[] chst = {'h', 'e', 'l', 'l', 'o'};
		String s3 = new String(chst,0,3);
		System.out.println("s3:"+s3);
		System.out.println("------------------------------");
		
		String s4 = ("hello");
		System.out.println("s4:"+s4);
	}

}
