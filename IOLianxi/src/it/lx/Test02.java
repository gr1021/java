package it.lx;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 实现数据的换行
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("ab.txt");
		fw.write("hello");
		
		//换行
		fw.write("\r\n");
		
		fw.write("world");
		
		fw.close();
	}
}
