package com.itheima01;
/*
 *  
 * StringBuilder:是一个可变的字符串。字符串缓冲区类。
 * 
 * String和StringBuilder的区别：
 * 		String的内容是固定的。
 * 		StringBuilder的内容是可变的。
 * 
 * 构造方法：
 * 		StringBuilder()
 * 
 * 成员方法：
 * 		public int capacity():返回当前容量   16
 * 		public int length():返回长度（字符数）
 * 
 * 		容量：理论值
 * 		长度：实际值
 */
public class Test13 {
	public static void main(String[] args) {
		//创建对象
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("sb:"+sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}
