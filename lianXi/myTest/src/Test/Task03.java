package Test;

import java.util.Scanner;

/*
 * 3. ͳ��һ������¼����ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����
 ������Hello520World
 �����
 ��д��ĸ��2
 �����ַ���3
 Сд��ĸ��8

 */
public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();

		char[] chs = s.toCharArray();
		int bigCount = 0;
		int smallCount = 0;
		int numCount = 0;
		for (int i = 0; i < chs.length; i++) {
			if (chs[i] >= 'A' && chs[i] <= 'Z') {
				bigCount++;
			}else if (chs[i] >= 'a' && chs[i] <= 'z') {
				smallCount++;
			}else if (chs[i] >= '0' && chs[i] <= '9') {
				numCount++;
			}else{
				System.out.println("��������ַ�"+chs+"�Ƿ�");
			}
		}
		System.out.println("��д��ĸ��"+bigCount+"��");
		System.out.println("�����ַ���"+numCount+"��");
		System.out.println("Сд��ĸ��"+smallCount+"��");
	}
}
