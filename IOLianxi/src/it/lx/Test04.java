package it.lx;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ����Ŀ·���µ�FileWriterDemo.java�е����ݸ��Ƶ���Ŀ·���µ�Copy.
 */
public class Test04 {
	public static void main(String[] args) throws IOException {
		//������  ��������������
		FileReader fr = new FileReader("123.txt"); 
		
		//д����   �������������
		FileWriter fw = new FileWriter("copy.txt");
		
		//һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1){
			fw.write(chs);
		}
		fw.close();
		fr.close();
				
	}
}
