package com.itheima01;

/*
 * 加法的方法
 * 
 * 两个明确：
 * 		返回值类型  int
 *      参数列表  int a , int b
 */
public class MethodDemo01 {
	public static void main(String[] args) {
		//方法调用
		//有明确返回值类型的方法
		//单独调用，没有意义
		sum(10,20);
		
		//输出调用
		System.out.println(sum(10,20));
		
		//赋值调用
		int result = sum(10,20);
		System.out.println("------------------");
		System.out.println(result);
	}
	public static int sum(int a ,int b){
		int c = a + b;
		return c;
	}
}
