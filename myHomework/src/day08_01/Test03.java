package day08_01;

import java.util.Scanner;

/*
 * 1.����¼��һ��Դ�ַ������ַ������� scrStr ���� 
 * 2.����¼��һ��Ҫɾ�����ַ������ַ������� delStr ���� 
 * 3��ɾ������ scrStr �����е����� delStr �ַ��������յ��ַ����в��ܰ��� delStr�� ��Ҫ
              ���ӡɾ����Ľ���Լ�ɾ���˼��� delStr �ַ��� 
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��Դ�ַ�����");
		String scrStr = sc.nextLine();
		System.out.println("������һ��Ҫɾ�����ַ�����");
		String delStr = sc.nextLine();
		
		
	}
	public static void deleteStr(String s1,String s2){
		int count = 0;
		int index = -1;
		
		index = s1.indexOf(s2);
		if (index == -1) {
			return;
		}else {
			count ++;
			s1.substring(index, index+s2.length());
		}
	}
}
