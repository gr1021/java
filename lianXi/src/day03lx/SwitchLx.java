package day03lx;

import java.util.Scanner;

/*
 * ʹ��switch��䣬����¼��1-7�����֣���Ӧ��ӡ������
 */
public class SwitchLx {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("����������");
		int weekday = sc.nextInt();

		switch (weekday) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("���������������");
			break;
		}
	}
}
