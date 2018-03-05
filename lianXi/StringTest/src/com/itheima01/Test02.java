package com.itheima01;
/*
 *   通过构造方法创建的字符串对象和直接赋值方式创建的字符串对象有什么区别呢?
 * 		通过构造方法创建字符串对象是在堆内存。
 * 		直接赋值方式创建对象是在方法区的常量池。
 * 		
 * ==:
 * 		基本数据类型：比较的是基本数据类型的值是否相同
 * 		引用数据类型：比较的是引用数据类型的地址值是否相同
 */
public class Test02 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		String s3 = "hello";
		System.out.println("s1==s2:"+(s1 ==s2));
		System.out.println("s1==s3:"+(s1 ==s3));
		System.out.println("s2==s3:"+(s2 ==s3));
		
		String s4 = "Hello";
		System.out.println("s3==s4:"+(s3==s4));
	}
}
