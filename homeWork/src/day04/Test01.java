package day04;

import java.util.Random;
import java.util.Scanner;

/*
 * 1. ��ɲ�����С��Ϸ
 * 
 * ������ 1�����Ȼ�ȡһ�������1-100֮��
 * 		2������¼��һ���²������
 * 		3�����߽��бȽϣ��ж��Ƿ���У���Ӧ������ʾ
 * 		4��ʵ�ֶ��ѭ����ֱ������Ϊֹ ������
 */
public class Test01 {
	public static void main(String[] args) {

		// 1�����Ȼ�ȡһ�������
		Random r = new Random();
		int num = r.nextInt(100) + 1;

		// 4��ʵ�ֶ��ѭ����ֱ������Ϊֹ ������
		while (true) {
			// 2������¼��һ���²������
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�²�����ݣ�");
			int guessNumber = sc.nextInt();

			// 3�����߽��бȽϣ��ж��Ƿ���У���Ӧ������ʾ
			if (guessNumber > num) {
				System.out.println("��²�����ݴ���");
			} else if (guessNumber < num) {
				System.out.println("��²������С��");
			} else {
				System.out.println("��ϲ�������");
				break;
			}
		}
	}
}
