package com.itheima;
import java.util.Scanner;
/*
 *键盘录入两个数据，判断是否相等
 */
public class ScannerTest02 {
	public static void main(String[] args) {
		//键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请录入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请录入第二个数据：");
		int b = sc.nextInt();
		
		boolean flag = (a == b);
		System.out.println("flag:"+flag);
	}
}
