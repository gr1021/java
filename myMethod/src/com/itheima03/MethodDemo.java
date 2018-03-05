package com.itheima03;

/*
 * 方法重载
 * 数据求和   int类型的  float类型的    double类型的
 */
public class MethodDemo {
	public static void main(String[] args) {
		int sum1 =sum(10,20);
		System.out.println(sum1);
		int sum2= sum(10,20,30);
		System.out.println(sum2);
		
		float sum3 = sum(11.2F,11.8F);
		System.out.println(sum3);
		double sum4 = sum(12.6,23,12);
		System.out.println(sum4);
	}

	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static float sum(float a, float b) {
		float c = a + b;
		return c;
	}

	public static double sum(double a, double b, double c) {
		double x = a + b + c;
		return x;

	}

	public static int sum(int a, int b, int c) {
		int x = a + b + c;
		return x;

	}
}
