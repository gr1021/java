package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
 * 1�����Ȼ�ȡһ�������
 * 2������¼��һ���²������
 * 3������֮�����Ƚ�
 * 4��ʵ��һֱ�²⣬ֱ������Ϊֹ����while(true){ѭ�������}ʵ��
 */
public class RandomTest {
	public static void main(String[] args) {
		// 1�����Ȼ�ȡһ�������
		// ��������
		Random r = new Random();
		// ��ȡ���� 1-100
		int number = r.nextInt(100) + 1;
		while (true) {
			// 2������¼��һ���²������
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�²�����ݣ�");
			int guessNumber = sc.nextInt();

			// 3������֮�����Ƚ�
			if (guessNumber > number) {
				System.out.println("��²�����ݴ���");
			} else if (guessNumber < number) {
				System.out.println("��²������С��");
			} else {
				System.out.println("��ϲ��¶���");
				break;
			}
		}
	}
}
