package com.itheima01;

import java.util.Scanner;

/*
 * 字符串反转
 * 举例：键盘录入”abc”		
 * 输出结果：”cba”
 */
public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		//第一种方法
		
		String str = arrayReverse(s);
		System.out.println("str:"+str);
		
		String str1 = reverse(s);
		System.out.println("str1:"+str1);
	}

	public static String arrayReverse(String s){
		String ss = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			ss += s.charAt(i);
		}
		
		return ss;
		
	}
	
	public static String reverse(String s){
		char[] chs = s.toCharArray();
		
		for (int start = 0,end = s.length()-1; start < end; start++,end--) {
			char temp = chs[start];
			chs[start] = chs[end];
			chs[end] = temp;
		}
		String ss = new String(chs);
		return ss;
	}
}
