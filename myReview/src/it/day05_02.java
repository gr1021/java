package it;

import java.util.Random;

/*
 * 随机产生两个整数,随机数的范围均是[1,100],定义方法求这两个整数的和并打印和值 
 */
public class day05_02 {
	public static void main(String[] args) {
		
		//随机产生两个整数,随机数的范围均是[1,100]
		Random r = new Random();
		int num1 = r.nextInt(100)+1;
		int num2 = r.nextInt(100)+1;
		
		System.out.println(num1+"------"+num2);
		//调用方法
		int sum = getSum(num1,num2);
		System.out.println("sum:"+sum);
	}
	
	//定义方法求这两个整数的和并打印和值
	public static int getSum(int a,int b){
		
		return a + b;
	}
}
