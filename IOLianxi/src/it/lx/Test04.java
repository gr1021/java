package it.lx;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.
 */
public class Test04 {
	public static void main(String[] args) throws IOException {
		//读数据  创建输入流对象
		FileReader fr = new FileReader("123.txt"); 
		
		//写数据   创建输出流对象
		FileWriter fw = new FileWriter("copy.txt");
		
		//一次读取一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1){
			fw.write(chs);
		}
		fw.close();
		fr.close();
				
	}
}
