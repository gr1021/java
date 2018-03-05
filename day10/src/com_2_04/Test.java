package com_2_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 项目根路径下有text.txt文件，内容如下：
 我爱黑马
 123456
 利用IO流的知识读取text.txt文件的内容反转后写入text.txt文件中，内容如下：
 123456
 我爱黑马
 */
public class Test {
	public static void main(String[] args) throws IOException {

		ArrayList<String> array = new ArrayList<String>();

		// 读取text.txt文件的内容
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}

		br.close();
		// 反转集合
		for (int i = 0; i < array.size() / 2; i++) {
			String temp = array.get(i);
			array.set(i, array.get(array.size() - 1 - i));
			array.set(array.size() - 1 - i, temp);

//			System.out.println(array);
		}
		// 内容反转后写入text.txt文件中
		BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));

		for (int i = 0; i < array.size(); i++) {
			bw.write(array.get(i));
			bw.newLine();
			bw.flush();
		}
		bw.close();

	}
}
