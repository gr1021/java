package com01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ����Ŀ��·������ data.txt �ļ����ļ��Ĵ������ļ����ݵ�������ֶ�������¼�룩,�ļ�
	����û��Ҫ��
	ʹ�� IO ����ȡ data.txt �ļ����� �е����� ���֡� 
	����ȡ������������ ʹ�� IO ��д�� ���ļ� result.txt �ļ���
	����data.txt �ļ����ݣ�as12qwq21Q2aed 
          ���ձ����� result.txt �ļ������ݣ�12212 
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
		//ʹ�� IO ����ȡ data.txt �ļ����� �е����� ���֡�
		char[] chs = new char[1024];
		int len ;
		char ch;
		while((len=br.read(chs))!=-1){
			for (int i = 0; i < chs.length; i++) {
				if (chs[i] >= '0'&&chs[i]<= '9') {
					bw.write(chs[i]);
				}
			}
		}
		br.close();
		bw.close();
				
	}
}
