package com.itheima01;

/*
 * 去除字符串两端空格	
 *		String trim()
 * 按照指定符号分割字符串	
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

		String[] str = s3.split("\\.");//用“.”切割，因为“.”是通配符所以要加上反斜杠
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
