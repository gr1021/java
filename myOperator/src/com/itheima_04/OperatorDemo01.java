package com.itheima_04;
/*
 * 逻辑运算符: 用于连接关系表达式
 * 			& ， | ， ，^ , !
 * 			&& , ||
 * &:有false则false
 * |： 有true则true
 * ^： 相同为false，不同为true
 * !：非true则false，非false则true
 */
public class OperatorDemo01 {
	public static void main(String[] args) {
		//定义变量
		int a = 3;
		int b = 4;
		int c = 5;
		
		//&
		System.out.println((a>b) & (a>c));//false & false
		System.out.println((a>b) & (a<c));//false & true
		System.out.println((a<b) & (a>c));//true & false
		System.out.println((a<b) & (a<c));//true & true
		System.out.println("-------------------------------");
		//|
		System.out.println((a>b) | (a>c));//false | false
		System.out.println((a>b) | (a<c));//false | true
		System.out.println((a<b) | (a>c));//true | false
		System.out.println((a<b) | (a<c));//true | true
		System.out.println("-------------------------------");
		// ^
		System.out.println((a>b) ^ (a>c));//false ^ false
		System.out.println((a>b) ^ (a<c));//false ^ true
		System.out.println((a<b) ^ (a>c));//true ^ false
		System.out.println((a<b) ^ (a<c));//true ^ true
		System.out.println("-------------------------------");
		// !
		System.out.println(!(a>b));// !false 
		System.out.println(!(a<b));// !true 
		System.out.println("-------------------------------");
		
	}
	
}
