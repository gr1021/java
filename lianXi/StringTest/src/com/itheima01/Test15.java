package com.itheima01;
/*
 * StringBuilder和String的相互转换
 * 
 * StringBuilder -- String
 * 		public String toString():通过toString()就可以实现把StringBuilder转成String
 * 
 * String -- StringBuilder
 * 		StringBuilder(String str):通过构造方法就可以实现把String转成StringBuilder
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
