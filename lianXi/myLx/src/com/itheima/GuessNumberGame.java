package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
 * ��������Ϸ  ���Ȼ�ȡһ�������  Ȼ�����¼������  �����бȽ� ���Ƿ��ܲ���
 */
public class GuessNumberGame {
	public static void main(String[] args) {
		// �������������
		Random r = new Random();
		// ��ȡ����
		int number = r.nextInt(100) + 1;

		while (true) {
			// ��������¼�����
			Scanner sc = new Scanner(System.in);

			// ��������
			System.out.println("��������Ҫ�²�����ݣ�");
			int guessNumber = sc.nextInt();

			// ����֮�����Ƚ�
			if (guessNumber > number) {
				System.out.println("����������ݴ���");
			} else if (guessNumber < number) {
				System.out.println("�����������С��");
			} else {
				System.out.println("��ϲ��¶���");
				break;
			}
		}
	}
}
