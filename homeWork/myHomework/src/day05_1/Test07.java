package day05_1;

import java.util.Scanner;

/*
 * 写方法：
 *  1.求两个数据之和(整数和小数) 
 *	2.判断两个数据是否相等(整数和小数) 
 *	3.获取两个数中较大的值(整数和小数) 
 *	4.获取两个数中较小的值(整数和小数) 
 *	5.否能用一个方法实现 3 和 4 的两个功能
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		double  y = sc.nextDouble();
		
		//1.求两个数据之和(整数和小数) 
		double sum = sum(x,y);
		System.out.println("sum:" + sum);
		
		//2.判断两个数据是否相等(整数和小数) 
		boolean flag = compare(x,y);
		System.out.println("flag:" + flag);
		
		//3.获取两个数中较大的值(整数和小数)
		double max = getMax(x,y);
		System.out.println("max:" + max);
		
		//4.获取两个数中较小的值(整数和小数) 
		double min = getMin(x,y);
		System.out.println("min:" + min);
		
		//5.能否用一个方法实现 3 和 4 的两个功能
		getMaxMin(x,y);
	}
	public static double sum(int a , double b){
		double c = a + b;
		return c;
	}
	public static boolean compare(int a, double b){
		if (a == b) {
			return true;
		}
		return false;
	}
	public static double getMax(int a, double b){
		if (a > b) {
			return a;
		}
		return b;
	}
	public static double getMin(int a, double b){
		if (a < b) {
			return a;
		}
		return b;
	}
	public static void getMaxMin(int a , double b){
		double max = 0;
		double min = 0;
		//最大值
		if (a > b) {
			max = a;
			min = b;
			System.out.println("max:"+max);
			System.out.println("min:"+min);
		}
		
	}
}
