package com.itheima01;

import java.util.Scanner;

/*
 * ģ���¼,�����λ���,����ʾ���м��Ρ�
 * 
 * ������1�����ȶ����û��������룬�洢���ڴ���
 * 		2��Ȼ�����¼���û���������
 * 		3�� ����֮����бȽϣ����Ƿ���ͬ������ͬ���¼�ɹ��������¼ʧ��
 * 
 */
public class Test04 {
	public static void main(String[] args) {
		String username = "admin";
		String password = "12345";
		for (int i = 0; i < 3; i++) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = sc.nextLine();
		System.out.println("���������룺");
		String psw = sc.nextLine();
		
		if (name.equals(username) && psw.equals(password)) {
			System.out.println("��¼�ɹ�");
			break;
		}else{
			if (2-i==0) {
				System.out.println("����û����������ѱ����������������Ա��ϵ");
			}
			System.out.println("��¼ʧ�ܣ��㻹��"+(2-i)+"�λ���");
		}
		}
	}
}
