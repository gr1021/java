package it;

import java.util.Scanner;

/*
 * 有定义一个方法,可以接受一个整数, 
如果为[90,100]这个范围方法返回’A’ 
如果为[80,90)这个范围方法返回’B’ 
如果为[70,80)这个范围方法返回’C’ 
如果为[60,70)这个范围方法返回’D’ 
如果为[0,60)这个范围方法返回’E’ 
整数不在以上范围的返回’F’ 
 */
public class day05_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int num = sc.nextInt();
		
		String x = aaa(num);
		System.out.println(x);
	}
	public static String aaa(int num){
		
		if (num >= 90 && num <= 100 ) {
			return "A";
		}else if (num >= 80 && num < 90) {
			return "B";
		}else if (num >= 70 && num < 80) {
			return "C";
		}else if (num >= 60 && num < 70) {
			return "D";
		}else if (num >= 0 && num < 60) {
			return "E";
		}else {
			return "F";
		}
	}
}
