package it;

import java.util.Scanner;



/*
 *  定义一个方法 能接受一个整数(这个整数大于 3)打印 0 到这个整数(包含)之间的所有的偶数 
	如 接受的数字是 6 则调用完方法打印出来的偶数是 0 2 4 6 
  	如 接受的数字是 5 则调用完方法打印出来的偶数是 0 2 4 
 */
public class day05_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数（大于3）：");
		int num = sc.nextInt();
		
		//调用方法
		getNum(num);
		
	}
	
	//定义一个方法 能接受一个整数(这个整数大于 3)打印 0 到这个整数(包含)之间的所有的偶数 
	public static void getNum(int num){
		
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
