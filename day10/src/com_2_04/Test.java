package com_2_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��Ŀ��·������text.txt�ļ����������£�
 �Ұ�����
 123456
 ����IO����֪ʶ��ȡtext.txt�ļ������ݷ�ת��д��text.txt�ļ��У��������£�
 123456
 �Ұ�����
 */
public class Test {
	public static void main(String[] args) throws IOException {

		ArrayList<String> array = new ArrayList<String>();

		// ��ȡtext.txt�ļ�������
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}

		br.close();
		// ��ת����
		for (int i = 0; i < array.size() / 2; i++) {
			String temp = array.get(i);
			array.set(i, array.get(array.size() - 1 - i));
			array.set(array.size() - 1 - i, temp);

//			System.out.println(array);
		}
		// ���ݷ�ת��д��text.txt�ļ���
		BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));

		for (int i = 0; i < array.size(); i++) {
			bw.write(array.get(i));
			bw.newLine();
			bw.flush();
		}
		bw.close();

	}
}
