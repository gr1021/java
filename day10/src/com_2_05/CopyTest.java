package com_2_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 1.��text.txt���Ƶ�d:\\��Ŀ¼��
	2.�ö��ַ�ʽʵ�ָ���
		(1)ʹ���ַ������ַ�ѭ������
		(2)ʹ���ַ��������ַ�����ʵ�ָ���
		(3)ʹ�ø�Ч�ַ�������ʵ�ָ���
 */
public class CopyTest {
	public static void main(String[] args) throws IOException {
		
		//(1)ʹ���ַ������ַ�ѭ������
		//chPrint();
		
		//(2)ʹ���ַ��������ַ�����ʵ�ָ���
		chsPrint();
		
		//(3)ʹ�ø�Ч�ַ�������ʵ�ָ���
		//print();
	}
	public static void print() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("123.txt"));
		
		String line;
		while((line = br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
	
	public static void chsPrint() throws IOException{
		FileReader fr = new FileReader("text.txt");
		FileWriter fw = new FileWriter("123.txt");
		
		char[] chs = new char[1024];
		@SuppressWarnings("unused")
		int len;
		while((len=fr.read(chs))!=-1){
			fw.write(chs);
			fw.flush();
		}
		fw.close();
		fr.close();
	}
	
	public static void chPrint() throws IOException{
		
		FileReader fr = new FileReader("text.txt");
		FileWriter fw = new FileWriter("123.txt");
		int ch;
		while((ch=fr.read())!=-1){
			fw.write(ch);
			fw.flush();
		}
		fw.close();
		fr.close();
	}
}
