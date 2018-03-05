package com_2_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 项目根路径下有个questions.txt文件内容如下：
 5+5
 150-25
 155*155
 2555/5
 要求：读取内容计算出结果，将结果写入到results.txt文件中
 */
public class QuestionTest {
	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		// 读取文件内容
		BufferedReader br = new BufferedReader(new FileReader("questions.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}

		// 遍历集合
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			int result = getResult(str);
			array.set(i, str + "=" + result);
		}

		// 将结果写入到results.txt文件中
		BufferedWriter bw = new BufferedWriter(new FileWriter("results.txt"));
		for (int i = 0; i < array.size(); i++) {
			bw.write(array.get(i));
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}

	// 计算式子的值
	public static int getResult(String str) {

		if (str.contains("+")) {
			int index = str.indexOf("+");
			String num1 = str.substring(0, index);
			String num2 = str.substring(index + 1);
			// 调用parseInt方法计算式子
			return Integer.parseInt(num1) + Integer.parseInt(num2);
		} else if (str.contains("-")) {
			int index = str.indexOf("-");
			String num1 = str.substring(0, index);
			String num2 = str.substring(index + 1);
			return Integer.parseInt(num1) - Integer.parseInt(num2);
		} else if (str.contains("*")) {
			int index = str.indexOf("*");
			String num1 = str.substring(0, index);
			String num2 = str.substring(index + 1);
			return Integer.parseInt(num1) * Integer.parseInt(num2);
		} else {
			int index = str.indexOf("/");
			String num1 = str.substring(0, index);
			String num2 = str.substring(index + 1);
			return Integer.parseInt(num1) / Integer.parseInt(num2);
		}
	}
}
