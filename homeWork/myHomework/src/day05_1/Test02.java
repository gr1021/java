package day05_1;

import java.util.Scanner;

/*
 * 分析一下需求，并用代码实现
 * 1、键盘录入长方形的长和宽
 * 		定义方法计算该长方形的周长，并在main方法中打印周长
 * 2、键盘录入长方形的长和宽
 * 		定义方法计算该长方形的面积，并在main方法中打印面积
 * 3、键盘录入圆的半径
 * 		定义方法计算该圆的周长，并在main方法中打印周长
 * 4、键盘录入圆的半径
 * 		定义方法计算该圆的面积，并在main方法中打印面积
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//长方形的长
		System.out.println("请输入第一个数据：");
		int chang = sc.nextInt();
		
		//长方形的宽
		System.out.println("请输入第二个数据：");
		int kuan = sc.nextInt();
		
		//调用长方形周长的方法
		int perimeter = perimeter(chang,kuan);
		System.out.println("长方形的周长是："+perimeter);
		
		//调用长方形面积的方法
		int area = area(chang , kuan);
		System.out.println("长方形的面积是：" + area);
		
		//圆的半径
		System.out.println("请输入第三个数据：");
		int r = sc.nextInt();
		
		//调用圆的周长的方法
		double perimeter1 = perimeter(r);
		System.out.println("圆的周长是：" + perimeter1);
		
		//调用圆的面积的方法
		double area1 = area(r);
		System.out.println("圆的面积是：" + area1);
		
	}
	
	//计算长方形的周长的方法
	public static int perimeter(int a ,int b){
		int perimeter = (a+b)*2;
		return perimeter;
	}
	
	//计算长方形面积的方法
	public static int area(int a, int b){
		int area = a * b;
		return area;
	}
	
	//计算圆的周长的方法
	public static double perimeter(int r){
		double perimeter = 3.14 * r *2;
		return perimeter;
	}
	
	//计算圆的面积的方法
	public static double area(int r){
		double area = 3.14 * r * r;
		return area;
	}
}
