package com.itheima_05;

/*
 * 
 * È¥³ý×Ö·û´®Á½¶Ë¿Õ¸ñ	
 *		String trim()
 * °´ÕÕÖ¸¶¨·ûºÅ·Ö¸î×Ö·û´®	
 *		String[] split(String str)
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "  helloworld  "; 
		String s2 = "aa,bb,cc";
		String s3 = "  hello  world  ";
		
		System.out.println("---"+s1+"---");
		System.out.println("---"+s1.trim()+"---");
		System.out.println("-----------------------------");
		System.out.println("---"+s3+"---");
		System.out.println("---"+s3.trim()+"---");
		System.out.println("-----------------------------");
	
		String[] str = s2.split(",");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	
	}
}
