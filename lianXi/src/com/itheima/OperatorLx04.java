package com.itheima;
/*
 * �߼��������& , |, ! , ^, && , ||
 */
public class OperatorLx04 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		// &:��false��false
		System.out.println((a > b) & (b > c));//false & false
		System.out.println((a < b) & (b > c));//true & false
		System.out.println((a > b) & (b < c));//false & true
		System.out.println((a < b) & (b < c));//true & true
		System.out.println("--------------------------------");
		
		// && :����� &һ��   ���ж�·Ч���������Ϊfalse���ұ߲�ִ��
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
		
		// || :����� | һ�� �� �����Ϊtrue���ұ߲�ִ��
		System.out.println((x++ > 3) || (y++ > 4));
		System.out.println(x);
		System.out.println(y);
		System.out.println("--------------------------------");
		
		// |����true��Ϊtrue
		System.out.println((a > b) | (b > c));//false | false
		System.out.println((a < b) | (b > c));//true | false
		System.out.println((a > b) | (b < c));//false | true
		System.out.println((a < b) | (b < c));//true | true
		System.out.println("--------------------------------");
		
		// ^:��ͬΪfalse����ͬΪtrue
		System.out.println((a > b) ^ (b > c));//false ^ false
		System.out.println((a < b) ^ (b > c));//true ^ false
		System.out.println((a > b) ^ (b < c));//false ^ true
		System.out.println((a < b) ^ (b < c));//true ^ true
		System.out.println("--------------------------------");
		
		// ! :��trueΪfalse����falseΪtrue
		System.out.println(!(a > b) );//!false 
		System.out.println(!(a < b) );//!true 
		
	}
}
