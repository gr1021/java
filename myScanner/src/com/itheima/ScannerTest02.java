package com.itheima;
import java.util.Scanner;
/*
 *����¼���������ݣ��ж��Ƿ����
 */
public class ScannerTest02 {
	public static void main(String[] args) {
		//����¼�����
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("��¼���һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("��¼��ڶ������ݣ�");
		int b = sc.nextInt();
		
		boolean flag = (a == b);
		System.out.println("flag:"+flag);
	}
}
