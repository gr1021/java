package it;

import java.util.Scanner;



/*
 *  ����һ������ �ܽ���һ������(����������� 3)��ӡ 0 ���������(����)֮������е�ż�� 
	�� ���ܵ������� 6 ������귽����ӡ������ż���� 0 2 4 6 
  	�� ���ܵ������� 5 ������귽����ӡ������ż���� 0 2 4 
 */
public class day05_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������������3����");
		int num = sc.nextInt();
		
		//���÷���
		getNum(num);
		
	}
	
	//����һ������ �ܽ���һ������(����������� 3)��ӡ 0 ���������(����)֮������е�ż�� 
	public static void getNum(int num){
		
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
