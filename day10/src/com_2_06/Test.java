package com_2_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ��
 ʵ��һ����֤��С����Ҫ�����£�
 1. ����Ŀ��Ŀ¼���½�һ���ļ���data.txt,����¼��3���ַ�����֤�룬������data.txt�У�Ҫ��һ����֤��ռһ�У�
 2. ����¼��һ����Ҫ��У�����֤�룬����������֤����data.txt�д��ڣ��ڿ���̨��ʾ��֤�ɹ�����������ڿ���̨��ʾ��֤ʧ��
 */
public class Test {
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		// ����¼��3���ַ�����֤�룬������data.txt�У�Ҫ��һ����֤��ռһ�У�
		write(arr);
		// ����¼��һ����Ҫ��У�����֤�룬����������֤����data.txt�д��ڣ�
		// �ڿ���̨��ʾ��֤�ɹ�����������ڿ���̨��ʾ��֤ʧ��
		equals(arr);

		
	}
	@SuppressWarnings("unused")
	public static void equals(ArrayList<String> arr){
		//// ����¼��һ����Ҫ��У�����֤�룬
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����У�����֤�룺");
		String s = sc.nextLine();
		
		// ����������֤����data.txt�д��ڣ��ڿ���̨��ʾ��֤�ɹ�����������ڿ���̨��ʾ��֤ʧ��
		for (int i = 0; i < arr.size(); i++) {
			String ss = arr.get(i);
			if (s.equals(ss)) {
				System.out.println("��֤�ɹ�");
				break;
			}else {
				System.out.println("��֤ʧ��");
				break;
			}
		}
		
	}

	public static void write(ArrayList<String> arr) throws IOException {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ���ַ�����֤��:");
		String s1 = sc.nextLine();
		System.out.println("������ڶ����ַ�����֤��:");
		String s2 = sc.nextLine();
		System.out.println("������������ַ�����֤��:");
		String s3 = sc.nextLine();

		arr.add(s1);
		arr.add(s2);
		arr.add(s3);

		BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
		for (int i = 0; i < arr.size(); i++) {
			String str = arr.get(i);
			bw.write(str);
			bw.newLine();
			bw.flush();

		}
		bw.close();
	}
}
