package it.lx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 将文本文件中的内容复制到集合中
 */
public class Test08 {
	public static void main(String[] args) throws IOException {
		//创建缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("12.txt"));
		
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		String line;
		while((line=br.readLine())!=null){
				array.add(line);
		}
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.print(s+" ");
		}
	}
}
