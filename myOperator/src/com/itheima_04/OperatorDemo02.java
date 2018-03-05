package com.itheima_04;
/*
 * &&:&&与&的结果一样
 * ||:||与|的结果一样
 * && 与 & 的区别：
 */
public class OperatorDemo02 {
	public static void main(String[] args) {
		//定义变量
		int a = 10;
		int b = 20;
		int c = 10;
		
		//&&
		System.out.println((a>b) && (a>c));//false && false
		System.out.println((a>b) && (a<c));//false && true
		System.out.println((a<b) && (a>c));//true && false
		System.out.println((a<b) && (a<c));//true && true
		System.out.println("-------------------------------");
		
		//||
		System.out.println((a>b) || (a>c));//false || false
		System.out.println((a>b) || (a<c));//false || true
		System.out.println((a<b) || (a>c));//true || false
		System.out.println((a<b) || (a<c));//true || true
		
		int x = 10;
		int y = 20;
		 
		//System.out.println((x++ > 10) & (y++ > 20));//flase & false
		System.out.println((x++ > 10) && (y++ > 20));//flase & false
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
	}
}
