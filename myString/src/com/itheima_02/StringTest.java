package com.itheima_02;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {

		String username = "abc";
		String password = "123";

		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String psw = sc.nextLine();

			if (name.equals(username) && psw.equals(password)) {
				System.out.println("��¼�ɹ�");
				break;
			} else {
				if (2 - i == 0) {
					System.out.println("����û��������ѱ��������������Ա��ϵ");
				} else {
					System.out.println("��¼ʧ�ܣ��㻹��" + (2 - i) + "�λ���");
				}
			}
		}
	}
}
