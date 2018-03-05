package it;

import java.util.Scanner;

/*
 * 键盘录入两个数据，判断是否相等
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第一个数据：");
		int b = sc.nextInt();
		
		boolean flag = compare(a,b);
		System.out.println(flag);
	}
	public static boolean  compare(int a , int b){
		return a==b;
	}
}
