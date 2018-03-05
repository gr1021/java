package com_2_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 1.将text.txt复制到d:\\根目录下
	2.用多种方式实现复制
		(1)使用字符流单字符循环复制
		(2)使用字符流利用字符数组实现复制
		(3)使用高效字符缓冲流实现复制
 */
public class CopyTest {
	public static void main(String[] args) throws IOException {
		
		//(1)使用字符流单字符循环复制
		//chPrint();
		
		//(2)使用字符流利用字符数组实现复制
		chsPrint();
		
		//(3)使用高效字符缓冲流实现复制
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
