package com01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * ����Ŀ��·���´����ļ� data.txt��data.txt �д�ŵ���������
 * ����:  2A0a@1wz7qq0EE4#25 
 * ��data.txt �ļ����ļ��е����ݿ����ֶ�������¼�룬�����ɳ������ɣ� 
 * ��дһ�����򣬻�ȡ data.txt �ļ������е����֣����ڿ���̨��ӡ����� 
 ��ʾ��ʽ�磺�ļ����������������У�20170425
 */
public class Test04 {
	public static void main(String[] args) throws IOException {

		// ��ȡ����
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));

		char[] chs = new char[1024];
		int len;
		System.out.print("�ļ����������������У�");
		while((len = br.read(chs))!=-1){
			for (int i = 0; i < chs.length; i++) {
				if (chs[i] >= '0'&&chs[i] <= '9') {
					System.out.print(chs[i]);
				}
			}
		}
	}
}
