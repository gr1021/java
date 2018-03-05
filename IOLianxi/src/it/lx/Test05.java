package it.lx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中
 * BufferedReader和BufferedWriter
 */
public class Test05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("123.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("23.txt"));
		
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1){
			bw.write(chs,0,len);
		}
		bw.close();
		br.close();
	}
}
