package it.lx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���ı��ļ��е����ݸ��Ƶ�������
 */
public class Test08 {
	public static void main(String[] args) throws IOException {
		//������������������
		BufferedReader br = new BufferedReader(new FileReader("12.txt"));
		
		//�������϶���
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
