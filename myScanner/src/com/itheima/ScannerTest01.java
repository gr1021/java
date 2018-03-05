package com.itheima;
import java.util.Scanner;
/*
 * 键盘录入两个数据，求和
 */
public class ScannerTest01 {
	public static void main(String[] args) {
		//键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		//求和
		int sum = a + b;
		 
		//输出结果
		System.out.println("sum:"+sum);
	}
}
