package day03lx;

import java.util.Scanner;

/*
 * ����¼��ɼ����ɼ���90����100֮������"����";80-90����"��";
 * 70-80����"��";60-70����"����";
 */
public class IfTestLx {
	public static void main(String[] args) {
		// ����¼��ɼ�
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		// ��������
		System.out.println("������ɼ���");
		int score = sc.nextInt();

		if (score >= 90 && score < 100) {
			System.out.println("����");
		} else if (score >= 80 && score < 90) {
			System.out.println("��");
		} else if (score >= 70 && score < 80) {
			System.out.println("��");
		} else if (score >= 60 && score < 70) {
			System.out.println("����");
		} else if (score >= 0 && score < 60) {
			System.out.println("������");
		}else{
			System.out.println("������ĳɼ�����");
		}
	}
}
