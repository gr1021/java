package com.itheima01;
/*
 * 添加功能
 *		public StringBuilder append(任意类型):添加数据，并返回自身对象
 * 反转功能
 *		public StringBuilder reverse()
 */
public class Test14 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("world");
		System.out.println("sb:"+sb);
		
		sb.reverse();
		System.out.println("sb:"+sb);
		
		sb.reverse();
		System.out.println("sb:"+sb);
		
		sb.append(123);
		System.out.println("sb:"+sb);
	}
}
