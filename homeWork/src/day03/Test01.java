package day03;

import java.util.Scanner;

/*
 * 1. ���ݶ�Ӧ�ķ��������Ӧ�ĵȼ�: 
 *	100 - 90 :  A
 *	80  - 89 :  B
 *	70  - 79 :  C
 *	60  - 69 :  D
 *	0   - 59 :  E
 */
public class Test01 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("�����������");
		int score = sc.nextInt();

		if (score >= 90 && score < 100) {
			System.out.println("A");
		} else if (score >= 80 && score < 90) {
			System.out.println("B");
		} else if (score >= 70 && score < 80) {
			System.out.println("C");
		} else if (score >= 60 && score < 70) {
			System.out.println("D");
		} else if (score >= 0 && score < 60) {
			System.out.println("E");
		} else {
			System.out.println("������ķ�������");
		}
	}
}
