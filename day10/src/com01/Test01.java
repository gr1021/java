package com01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * ��Ŀ����
 * ���û��ӿ���̨������Ϣ��������Ϣ�洢���ļ�Info.txt�С�
 * �������������Ϣ��ÿ����Ϣ�洢һ�С����û����룺��886��ʱ�����������
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("��������Ϣ��");
			String str = sc.nextLine();
			if (str.equals("886")) {
				break;
			}
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("Info.txt",true));
			
			bw.write(str);
			bw.newLine();
			bw.close();
			
			
		}
		
	}
}
