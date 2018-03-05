package it.lx;


import java.io.FileReader;
import java.io.IOException;

/*
 * 需求：从文件中读数据并显示到控制台
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("123.txt");
		
		/*//通过一次读取一个字符实现
		int ch;
		while((ch=fr.read())!=-1){
			System.out.print((char)ch);
		}*/
		
		//通过一次读取一个字符数组实现
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1){
			System.out.print(new String(chs,0,len));
		}
		
		fr.close();
	}
}
