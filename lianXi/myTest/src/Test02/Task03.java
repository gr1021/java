package Test02;

import java.util.Scanner;

/*
 *   ����: ����¼��һ���ַ���, �жϸ��ַ����Ƿ��ǶԳƵ�, �ڿ���̨��������
 ����: ¼���ַ��� ��level��, ������Ϊ: ��level�ǶԳƵġ�
 ¼���ַ��� ��good��, ������Ϊ: ��good�ǲ��ԳƵġ�

 */
public class Task03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = sc.nextLine();
				
								/*
								 * StringBuilder sb = new StringBuilder(str);
								 *  sb.reverse();
								 *  String s =sb.toString();
								 *  if (ss.length()== 1) {
										System.out.println("�ַ�������Ϊ1 �������ڶԳ�"); 
									}else if (s.equals(str)) { 
								 *  System.out.println(str+"�ǶԳƵ�");
								 * }else{ 
								 * System.out.println(str+"�ǲ��ԳƵ�"); 
								 * }
								 */

		// ���巽��ʵ��
		aaa(str);
								/*boolean flag = bbb(str);
								System.out.println(flag);*/
	}

	public static void aaa(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String ss = sb.toString();
		if (ss.length()== 1) {
			System.out.println("�ַ�������Ϊ1 �������ڶԳ�");
		}else if (ss.equals(s)) {
			System.out.println(s + "�ǶԳƵ�");
		} else {
			System.out.println(s + "�ǲ��ԳƵ�");
		}
	}

								/*public static boolean bbb(String s) {
							
									StringBuilder sb = new StringBuilder(s);
									sb.reverse();
									String ss = sb.toString();
									if (ss.length()== 1) {
											System.out.println("�ַ�������Ϊ1 �������ڶԳ�");
									}else if (ss.equals(s)) {
										return true;
									} else {
										return false;
									}
								}*/
}
