package it.lx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.
 * 
 * 缓冲流的特殊功能   以字符串的形式写出
 */
public class Test06 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("123.txt"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
		
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
		
}

