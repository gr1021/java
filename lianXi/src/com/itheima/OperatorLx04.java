package com.itheima;
/*
 * 逻辑运算符：& , |, ! , ^, && , ||
 */
public class OperatorLx04 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		// &:有false则false
		System.out.println((a > b) & (b > c));//false & false
		System.out.println((a < b) & (b > c));//true & false
		System.out.println((a > b) & (b < c));//false & true
		System.out.println((a < b) & (b < c));//true & true
		System.out.println("--------------------------------");
		
		// && :结果与 &一样   ，有短路效果，左边若为false，右边不执行
		System.out.println((a > b) && (b > c));//false && false
		System.out.println((a < b) && (b > c));//true && false
		System.out.println((a > b) && (b < c));//false && true
		System.out.println((a < b) && (b < c));//true && true
		System.out.println("--------------------------------");
		 
		int x = 3;
		int y = 4;
		System.out.println((x++ > 3) && (y++ > 4));
		System.out.println(x);
		System.out.println(y);
		System.out.println("--------------------------------");
		
		// || :结果与 | 一样 ， 左边若为true，右边不执行
		System.out.println((x++ > 3) || (y++ > 4));
		System.out.println(x);
		System.out.println(y);
		System.out.println("--------------------------------");
		
		// |：有true则为true
		System.out.println((a > b) | (b > c));//false | false
		System.out.println((a < b) | (b > c));//true | false
		System.out.println((a > b) | (b < c));//false | true
		System.out.println((a < b) | (b < c));//true | true
		System.out.println("--------------------------------");
		
		// ^:相同为false，不同为true
		System.out.println((a > b) ^ (b > c));//false ^ false
		System.out.println((a < b) ^ (b > c));//true ^ false
		System.out.println((a > b) ^ (b < c));//false ^ true
		System.out.println((a < b) ^ (b < c));//true ^ true
		System.out.println("--------------------------------");
		
		// ! :非true为false，非false为true
		System.out.println(!(a > b) );//!false 
		System.out.println(!(a < b) );//!true 
		
	}
}
