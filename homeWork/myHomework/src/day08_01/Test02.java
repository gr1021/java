package day08_01;

import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ�� 
 * 1.����¼��һ�����ַ���,��¼��һ��С�ַ��� 
 * 2.ͳ��С�ַ����ڴ��ַ����г��ֵĴ��� 
 * 3.�������д�ӡ��ʽ:
 * ���ַ���:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma 
 * С�ַ���:heima 
 */
public class Test02 {
	public static void main(String[] args) {
		// 1.����¼��һ�����ַ���,��¼��һ��С�ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ַ�����");
		String s1 = sc.nextLine();
		System.out.println("������С�ַ�����");
		String s2 = sc.nextLine();
		
		// 2.ͳ��С�ַ����ڴ��ַ����г��ֵĴ���
		int count = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)=='h'&&s1.charAt(i+1)=='e'&&s1.charAt(i+2)=='i') {
				if (s1.charAt(i+3)=='m'&&s1.charAt(i+4)=='a') {
					count++;
				}
			}
		}
		System.out.println("С�ַ���"+s2+",�ڴ��ַ���"+s1+"�й�����"+count+"��");
		
	}
}
