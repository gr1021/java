package it.lx;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ʵ�����ݵĻ���
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("ab.txt");
		fw.write("hello");
		
		//����
		fw.write("\r\n");
		
		fw.write("world");
		
		fw.close();
	}
}
