package day05;

import java.util.Scanner;

/*
 * �ж���һ�����������Խ���һ��������
 * ���Ϊ[90,100]�����Χ��������'A'
 * ���Ϊ[80,90)�����Χ��������'B'
 * ���Ϊ[70,80)�����Χ��������'C'
 * ���Ϊ[60,70)�����Χ��������'D'
 * ���Ϊ[0,60)�����Χ��������'E'
 * �����������Ϸ�Χ�ķ���'F'
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������(0-100)");
		int n = sc.nextInt();

		// ���÷���
		char x = print(n);
		System.out.println("x:"+ x);
	}

	/*public static void print(int n) {

		if (n >= 90 && n <= 100) {
			System.out.println("A");
		} else if (n >= 80 && n < 90) {
			System.out.println("B");
		} else if (n >= 70 && n < 80) {
			System.out.println("C");
		} else if (n >= 60 && n < 70) {
			System.out.println("D");
		} else if (n >= 0 && n < 60) {
			System.out.println("E");
		} else {
			System.out.println("F");
		}
	}
*/
	public static char print(int n) {
		if (n >= 90 && n <= 100) {
			return 'A';
		} else if (n >= 80 && n < 90) {
			return 'B';
		} else if (n >= 70 && n < 80) {
			return 'C';
		} else if (n >= 60 && n < 70) {
			return 'D';
		} else if (n >= 0 && n < 60) {
			return 'E';
		} else {
			return 'F';
		}
	}
}
