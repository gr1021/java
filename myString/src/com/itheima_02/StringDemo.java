package com.itheima_02;

public class StringDemo {
	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 =  "HelloWorld";
		String s3 = "hello";
		String s4 = "Hello";
		//比较字符串内容
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println("--------------------------------");
		
		System.out.println(s2.startsWith("He"));
		System.out.println(s3.endsWith("o"));
		
		//比较字符串地址
		System.out.println("---------------------------");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
	}
}
