package it.lx;

import java.io.FileWriter;
import java.io.IOException;

/*
 * void write(String str):дһ���ַ�������
 * void write(String str,int index,int len):дһ���ַ����е�һ��������
 * void write(int ch):дһ���ַ�����,����дint���͵ĺô��Ǽȿ���дchar���͵����ݣ�Ҳ����дchar��Ӧ��int���͵�ֵ��'a',97
 * void write(char[] chs):дһ���ַ���������
 * void write(char[] chs,int index,int len):дһ���ַ������һ��������
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		//�������������
		FileWriter fw = new FileWriter("123.txt");
		
		//дһ���ַ�������
		//fw.write("hello");
		
		//дһ���ַ����е�һ��������
		//fw.write("helloworld",1,4);
		
		//дһ���ַ���������
		char[] ch = {'a','b','1','2','3'};
		//fw.write(ch);
		
		//дһ���ַ������һ��������
		//fw.write(ch,2,3);
		
		//дһ���ַ�����,
		//����дint���͵ĺô��Ǽȿ���дchar���͵����ݣ�
		//Ҳ����дchar��Ӧ��int���͵�ֵ��'a',97
		fw.write('a');
		fw.write(98);
		fw.flush();
		
		fw.close();
	}
}
