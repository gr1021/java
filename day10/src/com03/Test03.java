package com03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ����˵����
 * ���ļ�name.txt�е����ݡ�¬���塱�޸�Ϊ����ʷ�Ĺ�����
 *
 2.	ѭ�����ļ��ж�ȡ���ݣ�ÿ�ζ�ȡһ�У�������ÿ������ֵ����װ��һ��Student�����У�������������װ�������С�
 3.	�������ϣ��ҵ�Ҫ�޸ĵġ�¬���塱�����������޸�Ϊ����ʷ�Ĺ�����
 ͬʱ�������ٴ�д�ص��ļ��С�
 4.	�����������֤�ļ��е������Ƿ��޸ĳɹ���

 */
public class Test03 {
	public static void main(String[] args) throws IOException {

		// ����һ���洢Student����ļ���
		ArrayList<Student> array = new ArrayList<Student>();

		// �������뻺�����Ķ���
		BufferedReader br = new BufferedReader(new FileReader("name.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			String[] str = line.split(",");
			Student s = new Student(str[0],str[1],str[2],str[3]);
			array.add(s);
		}
		//��������
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getName().equals("¬����")) {
				s.setName("ʷ�Ĺ�");
			}
			System.out.println(s.getId()+"---"+s.getName()+"---"+s.getSex()+"---"+s.getAge());
		}
		br.close();
		//ͬʱ�������ٴ�д�ص��ļ���
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("name.txt"));
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getSex()).append(",").append(s.getAge());
			
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
