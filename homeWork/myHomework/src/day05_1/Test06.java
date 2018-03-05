package day05_1;

import java.util.Scanner;

/*
 * 1.����¼��һ������(�������߸���������,���Ƿ���λ������Ч������λ) 
 * 2.����һ������,�÷����Ĺ����Ǽ���������Ǽ�λ����,����λ������ 
 * 3.�� main �����д�ӡ�������Ǽ�λ�� 
 * 4.��ʾ��ʽ����:
 * (1)��ʾһ: 
 * 			������һ������:1234 
 * 			����̨���:1234 �� 4 λ����
 * 	(2)��ʾ��: 
 * 			������һ������:-34567 
 * 			����̨���:-34567 �� 5 λ����	
 * 
 * ������	
 */
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = sc.nextInt();
		
		int n = count(num);
		System.out.println("n:" + n);
	}
	public static int count(int num){
		int n = 1;           //������һλ��
		while(true){
			num /= 10;        //num ÿ�γ���10
			if (num == 0) {
				break;
			}
			n++;
		}
		return n;
	}
}
