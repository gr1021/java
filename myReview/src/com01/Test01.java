package com01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ��Ŀ��·���´����ļ� Test05.txt��Test05.txt �д����������
 * ADGdadfFSA 
 * FDDS324dfa 
 * 1232da3daA
 * ��д���򣬻�ȡ Test05.txt �ļ������ݣ�ͳ�ƶ�ȡ������������ĸ�ĸ�������д
	��ĸ��Сд��ĸ��Ҫͳ�ƣ���������ȡ�Ľ���ڿ���̨��ӡ��� 
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		
		//��Ŀ��·���´����ļ� Test05.txt
		BufferedWriter bw = new BufferedWriter(new FileWriter("Test05.txt"));
		
		bw.write("ADGdadfFSA");
		bw.newLine();
		bw.write("FDDS324dfa");
		bw.newLine();
		bw.write("1232da3daA");
		bw.close();
		
		//��ȡ Test05.txt �ļ������ݣ�ͳ�ƶ�ȡ������������ĸ�ĸ���
		BufferedReader br = new BufferedReader(new FileReader("Test05.txt"));
		
		char[] chs = new char[1024];
		int len;
		int count = 0;
		while((len = br.read(chs))!=-1){
			for (int i = 0; i < chs.length; i++) {
				if (chs[i]>='A'&&chs[i]<='Z' || chs[i]>='a'&&chs[i]<='z') {
					count++;
				}
			}
		}
		System.out.println("��������ĸ�ĸ�����"+count);
		
		br.close();
	}
}
