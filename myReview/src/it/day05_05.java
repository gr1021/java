package it;

import java.util.Scanner;

/*
 * �ж���һ������,���Խ���һ������, 
���Ϊ[90,100]�����Χ�������ء�A�� 
���Ϊ[80,90)�����Χ�������ء�B�� 
���Ϊ[70,80)�����Χ�������ء�C�� 
���Ϊ[60,70)�����Χ�������ء�D�� 
���Ϊ[0,60)�����Χ�������ء�E�� 
�����������Ϸ�Χ�ķ��ء�F�� 
 */
public class day05_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		int num = sc.nextInt();
		
		String x = aaa(num);
		System.out.println(x);
	}
	public static String aaa(int num){
		
		if (num >= 90 && num <= 100 ) {
			return "A";
		}else if (num >= 80 && num < 90) {
			return "B";
		}else if (num >= 70 && num < 80) {
			return "C";
		}else if (num >= 60 && num < 70) {
			return "D";
		}else if (num >= 0 && num < 60) {
			return "E";
		}else {
			return "F";
		}
	}
}
