package com.itheima;

import java.util.Scanner;

/*
 *����¼���������ݣ��Ƚ��������Ƿ����
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int x = sc.nextInt();
		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();
		
		int max = getMax(x, y);
		System.out.println(max);
	}
	public static int getMax(int a , int b){
		int max = (a > b) ? a : b;
		return max;
	}
}
