package com01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * ����Ŀ��Ŀ¼����һ�� test.txt �ļ�������������
 * Ա�����ڿͲ��Ǵ� 
      ���������Σ����Էɷ�
      ��test.txt �ļ����ļ��е����ݿ����ֶ�������¼�룬�����ɳ������ɣ�
      ���ļ��е����ݶ�ȡ����������ת����ӡ������̨����ӡ��ʽ����������
      ���ǲ��ͺ������Ա 
        �ŷ����ң������𺽣�
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		//���ļ��е����ݶ�ȡ����������ת
		String line;
		while((line =br.readLine())!=null){
			StringBuilder sb = new StringBuilder(line);
			sb.reverse();
			System.out.println(sb);
		}
		br.close();
	}
}
