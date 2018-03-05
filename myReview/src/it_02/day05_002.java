package it_02;

import java.util.Scanner;

/*
 * 键盘录入长方形的长和宽
 * 定义方法计算该长方形的周长,并在 main 方法中打印周长 
 * 键盘录入长方形的长和宽 
 * 定义方法计算该长方形的面积,并在 main 方法中打印面积 
 * 键盘录入圆的半径 
 * 定义方法计算该圆的周长,并在 main 方法中打印周长 
 * 键盘录入圆的半径 
 * 定义方法计算该圆的面积,并在 main 方法中打印面积 
 */
public class day05_002 {
	public static void main(String[] args) {
		
		//键盘录入长方形的长和宽
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入长方形的长：");
		int a = sc.nextInt();
		System.out.println("请输入长方形的宽：");
		int b = sc.nextInt();
		System.out.println("请输入圆的半径：");
		int r = sc.nextInt();
		
		//长方形的周长
		int zc = zc(a,b);
		System.out.println("长方形的周长是："+zc);
		
		//长方形的面积
		int area = area(a,b);
		System.out.println("长方形的面积是："+area);
		
		//圆的周长
		double zhc = zc(r);
		System.out.println("圆的周长是："+ zhc);
		//圆的面积
		double area1 = area(r);
		System.out.println("圆的面积是:"+area1);
	}
	
	//定义方法计算该长方形的周长,并在 main 方法中打印周长 
	public static int zc(int a ,int b){
		return (a+b)*2;
	}
	//定义方法计算该长方形的面积,并在 main 方法中打印面积 
	public static int area(int a , int b){
		return a*b;
	}
	
	//定义方法计算该圆的周长,并在 main 方法中打印周长 
	public static double zc(int r){
		return 3.14*r*2;
	}
	
	//定义方法计算该圆的面积,并在 main 方法中打印面积 
	public static double area(int r){
		return 3.14*r*r;
	}
}
