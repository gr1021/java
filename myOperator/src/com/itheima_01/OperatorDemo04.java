package com.itheima_01;
/*
 * ++  --既可以放在变量前面也可放在变量后面
 * ++在前，先自增后运算，++在后先运算再自增
 */
public class OperatorDemo04 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a:"+a);
		//++的使用
		/*int x = a++;
		System.out.println("x:"+x);
		System.out.println("a:"+a);
		int y = ++a;
		System.out.println("y:"+y);
		System.out.println("a:"+a);*/
		
		//--的使用
		int b = a--;
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		int x = --a;
		System.out.println("x:"+x);
		System.out.println("a:"+a);
		
	}
}
