package it;

import java.util.Scanner;

/*
 * ����¼���������ݣ��ж��Ƿ����
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("�������һ�����ݣ�");
		int b = sc.nextInt();
		
		boolean flag = compare(a,b);
		System.out.println(flag);
	}
	public static boolean  compare(int a , int b){
		return a==b;
	}
}
