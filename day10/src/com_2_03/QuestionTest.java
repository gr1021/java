package com_2_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��Ŀ��·�����и�questions.txt�ļ��������£�
 5+5
 150-25
 155*155
 2555/5
 Ҫ�󣺶�ȡ���ݼ��������������д�뵽results.txt�ļ���
 */
public class QuestionTest {
	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		// ��ȡ�ļ�����
		BufferedReader br = new BufferedReader(new FileReader("questions.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}

		// ��������
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			int result = getResult(str);
			array.set(i, str + "=" + result);
		}

		// �����д�뵽results.txt�ļ���
		BufferedWriter bw = new BufferedWriter(new FileWriter("results.txt"));
		for (int i = 0; i < array.size(); i++) {
			bw.write(array.get(i));
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}

	// ����ʽ�ӵ�ֵ
	public static int getResult(String str) {

		if (str.contains("+")) {
			int index = str.indexOf("+");
			String num1 = str.substring(0, index);
			String num2 = str.substring(index + 1);
			// ����parseInt��������ʽ��
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
