package com02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*	����һ���洢Student����ļ��ϣ�
 ѭ��3�Σ��ӿ���̨����3��ѧԱ��Ϣ��ÿ����Ϣ��װһ��Student���󣬽�ÿ��Student����洢�������С�
 �������ϣ���ȡÿ��Student����ȡ����������ֵ��������ļ�Test2_2.txt�С�ÿ��ѧԱ��Ϣռһ��

 */
public class Test02 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		ArrayList<Student> array = new ArrayList<Student>();

		for (int i = 0; i < 3; i++) {
			System.out.println("������ѧ�ţ�");
			String id = sc.nextLine();
			System.out.println("������������");
			String name = sc.nextLine();
			System.out.println("�������Ա�");
			String sex = sc.nextLine();
			System.out.println("���������䣺");
			String age = sc.nextLine();
			Student s = new Student(id, name, sex, age);
			array.add(s);
		}
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "---" + s.getName() + "---"
					+ s.getSex() + "---" + s.getAge());
			// ������ļ�Test2_2.txt��
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("Test2_2.txt",true));

			bw.write(s.getId());
			bw.write("---");
			bw.write(s.getName());
			bw.write("---");
			bw.write(s.getSex());
			bw.write("---");
			bw.write(s.getAge());
			bw.newLine();
			bw.close();

		}

	}
}
