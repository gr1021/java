package day08;

import java.util.Scanner;

/*
 * һ������˵�������û�����һ����QQ ���롱 ���������ж���� QQ �����Ƿ���ȷ��  
 * Ҫ��ʹ�÷���������жϹ��ܡ� 
 * 
 * 
 * 
 * */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����֣�");
		String QQ = sc.nextLine();

		boolean flag = checkQQ(QQ);
		System.out.println("flag:" + flag);

	}

	public static boolean checkQQ(String qq) {
		/*
		 * 1)������ 5��12 λ���֣� 2) ��λ������ 0��
		 */
		String ss = new String(qq);
		if (ss.length() >= 5 && ss.length() <= 12) {
			for (int i = 0; i < ss.length(); i++) {
				if (ss.charAt(0) != '0' && ss.charAt(i) >= '0' && ss.charAt(i) <= '9') {
					return true;
				}else{
					return false;
				}
			}	
		}
		return false;
	}
}
