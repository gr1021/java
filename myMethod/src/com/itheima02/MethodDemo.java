package com.itheima02;

/*
 * 在控制台输出10次HelloWorld
 */
public class MethodDemo {
	public static void main(String[] args) {
		
		//单独调用   无返回值类型的方法只能单独调用
		print();
		System.out.println("--------------");
		print1(3);
	}
	//无参数
	public static void print(){
		for (int i = 0; i < 10; i++) {
			System.out.println("HelloWorld");
		}
	}
	//有参数
	public static void print1(int n){
		for (int i = 0; i < n; i++) {
			System.out.println("HelloWorld");
		}
	}
}
