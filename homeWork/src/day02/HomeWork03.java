package day02;

import java.util.Scanner;

/*
 * 3. ����¼��һ������,�ж���������Ƿ���ż��,�����ż�����ڿ���̨���"��
 *    ", �������ż���ڿ���̨���"Ů" ; (ʹ����Ԫ��������)
 *    ���Ƚ��е������ٴ�������¼�����Ȼ���������
 */
public class HomeWork03 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("���������ݣ�");
		int a = sc.nextInt();

		/*boolean x = (a % 2 == 0) ? true : false;
		if (x == true) {
			System.out.println("��");
		} else {
			System.out.println("Ů");
		}*/
		
		System.out.println(a % 2 == 0? "��" : "Ů");
	}
}
