package com_2_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 1.��Ŀ��Ŀ¼�½����ļ��� user.txt���ļ��д���û����͵�¼���룬��ʽ���û���������,�磺aaa,123��
 2. user.txt�ļ��г�ʼ��ŵ��û���Ϣ�����£�
 jack,123
 rose,123
 tom,123
 3.Ҫ��������¹��ܣ�
 ��������ʱ������̨��ʾ�û�����ע����û��������룻
 ��֤����¼����û�����user.txt����ע����û����Ƿ��ظ���
 �ǣ�����̨��ʾ���û����Ѵ���
 �񣺽�����¼����û���������д��user.txt�ļ������ڿ���̨��ʾ��ע��ɹ���

 */
public class UserTest {
	public static void main(String[] args) throws IOException {

		// ���ȶ�ȡ�ļ��е�����
		BufferedReader br = new BufferedReader(new FileReader("user.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			String[] str = line.split(",");

			// ��������¼�����
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < str.length; i++) {
				System.out.println("�밴��ʽ����:�û���������");
				String len = sc.nextLine();
				String[] str1 = len.split(",");

				if (str[0].equals(str1[0])) {
					System.out.println("�û����Ѵ���");
					break;
				} else {

					// ��ע����û�д���ļ���
					BufferedWriter bw = new BufferedWriter(new FileWriter(
							"user.txt", true));
					bw.write(str1[0]);
					bw.write(",");
					bw.write(str1[1]);
					bw.newLine();
					System.out.println("ע��ɹ�");
					bw.close();
				}
			}
		}
		br.close();
	}
}
