package com.itheima_06;

public class StringBuilderDeno {
	public static void main(String[] args) {
		//创建对象
		
		StringBuilder sb = new StringBuilder();
		/*
		StringBuilder sb2 = sb.append("hello");
		
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb== sb2);
		System.out.println("------------------");*/
		
		sb.append("hello");
		sb.append("world");
		sb.append(true);
		sb.append(100);
		
		System.out.println(sb);
		System.out.println("----------");
		
		sb.append("hello").append("world").append(true).append(100);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	}
}
