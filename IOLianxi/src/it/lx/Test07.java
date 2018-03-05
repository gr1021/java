package it.lx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 将集合中的元素复制到文本文件中
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		//给集合中添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//创建输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("12.txt"));
		
		//写数据到文件中      遍历集合
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();
	}
}
