package com.itheima_04;

import java.util.Scanner;

/*
 * д��һ���ַ���������ĸת��Ϊ��д ����ת��ΪСд
 */
public class StringTest {
	public static void main(String[] args) {
		
		//����¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		//��ȡ����ĸ��������ĸ
		String s1 = s.substring(0,1);
		String s2 = s.substring(1);
		
		//������ĸת��Ϊ��д������ת��ΪСд��ƴ������
		String s3 = s1.toUpperCase() + s2.toLowerCase();
		System.out.println("s3:"+s3);
	}
}
