package it.lx;

import java.io.FileWriter;
import java.io.IOException;

/*
 * void write(String str):写一个字符串数据
 * void write(String str,int index,int len):写一个字符串中的一部分数据
 * void write(int ch):写一个字符数据,这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
 * void write(char[] chs):写一个字符数组数据
 * void write(char[] chs,int index,int len):写一个字符数组的一部分数据
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		//创建输出流对象
		FileWriter fw = new FileWriter("123.txt");
		
		//写一个字符串数据
		//fw.write("hello");
		
		//写一个字符串中的一部分数据
		//fw.write("helloworld",1,4);
		
		//写一个字符数组数据
		char[] ch = {'a','b','1','2','3'};
		//fw.write(ch);
		
		//写一个字符数组的一部分数据
		//fw.write(ch,2,3);
		
		//写一个字符数据,
		//这里写int类型的好处是既可以写char类型的数据，
		//也可以写char对应的int类型的值。'a',97
		fw.write('a');
		fw.write(98);
		fw.flush();
		
		fw.close();
	}
}
