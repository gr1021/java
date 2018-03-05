package Test;

import java.util.Scanner;

/*
 * 1. 请分别设计求长方形面积和周长的方法，通过方法传参的方式，
 * 将长方形的长和宽传入，计算长方形的面积和周长(8分)
 */
public class Task01 {
		public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("请输入长方形的长：");
			int a = sc.nextInt();
			System.out.println("请输入长方形的宽：");
			int b = sc.nextInt();
			
			int zhouchang = zhouChang(a,b);
			System.out.println("长方形的周长是："+ zhouchang);
			
			int area = area(a,b);
			System.out.println("长方形的面积是："+area);
			
		}
		public static int  zhouChang(int a , int b){
			return (a +b)*2;
		}
		public static int area(int a ,int b){
			return a*b;
		}
}
