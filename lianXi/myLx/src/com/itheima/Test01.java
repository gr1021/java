package com.itheima;

import java.util.Scanner;

/*
 *����¼���������ݣ�����������ݵ����ֵ
 */
public class Test01 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		//��������
		System.out.println("�������һ�����ݣ�"); 
		int x = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�"); 
		int y = sc.nextInt();
		
		
		if (x > y) {
		
			System.out.println("���ֵ�ǣ�"+ x);
		}else{
			System.out.println("���ֵ�ǣ�"+ y);
		}
	}
}
