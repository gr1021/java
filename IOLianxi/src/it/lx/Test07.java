package it.lx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * �������е�Ԫ�ظ��Ƶ��ı��ļ���
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//�����������Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("12.txt"));
		
		//д���ݵ��ļ���      ��������
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		//�ͷ���Դ
		bw.close();
	}
}
