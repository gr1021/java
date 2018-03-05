package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * IO���ѧ������ϵͳ
 */
public class StudentTest {
	public static void main(String[] args) throws IOException {
		//����һ���ļ�·������
		String Filename = "students.txt";
		
		while (true) {
			System.out.println("--------------��ӭ����ѧ������ϵͳ������----------------------");
			System.out.println("1 �鿴����ѧ����Ϣ");
			System.out.println("2 ���ѧ����Ϣ");
			System.out.println("3 ɾ��ѧ����Ϣ");
			System.out.println("4 �޸�ѧ����Ϣ");
			System.out.println("5 �˳�����ϵͳ");
			System.out.println("���������ѡ��");

			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();

			switch (choiceString) {
			case "1":
				// �鿴����ѧ������Ϣ
				findAllStudent(Filename);
				break;
			case "2":
				// ���ѧ����Ϣ
				addStudent(Filename);
				break;
			case "3":
				// ɾ��ѧ����Ϣ
				deleteStudent(Filename);
				break;
			case "4":
				// �޸�ѧ����Ϣ
				updateStudent(Filename);
				break;
			case "5":
				// �˳�
			default:
				System.out.println("лл����ʹ��");
				System.exit(0);
				break;
			}
		}
	}
	//��ȡ����
	public static void readData(String Filename,ArrayList<Student> array) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(Filename));
		
		String line;
		while((line=br.readLine())!=null){
			String[] str = line.split(",");
			Student s = new Student(str[0],str[1],str[2],str[3]);
			array.add(s);
		}
		br.close();
	}
	
	//д���ݵ��ı��ļ���
	public static void writeData(String Filename,ArrayList<Student> array) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(Filename));
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).
			append(",").append(s.getAge()).append(",").append(s.getAddress());
			
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
	// �鿴����ѧ������Ϣ
	public static void findAllStudent(String Filename) throws IOException {
		
		//�������ϴ洢ѧ����Ϣ
		ArrayList<Student> array = new ArrayList<Student>();
		//���ļ��е���Ϣ��ȡ��������
		readData(Filename,array);
		
		if (array.size() == 0) {
			System.out.println("������˼,Ŀǰû��ѧ����Ϣ�ɹ���ѯ,���ȥ����ѡ����Ĳ���");
			return;
		}
		System.out.println("ѧ��\t����\t����\tסַ");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t"
					+ s.getAge() + "\t" + s.getAddress());
		}
	}

	// ���ѧ����Ϣ
	public static void addStudent(String Filename) throws IOException {
		
		//�������ϴ洢ѧ����Ϣ
		ArrayList<Student> array = new ArrayList<Student>();
		//���ļ��е���Ϣ��ȡ��������
		readData(Filename,array);
		
		Scanner sc = new Scanner(System.in);

		String id;
		while (true) {
			boolean flag = false;
			System.out.println("������ѧ��ѧ�ţ�");
			id = sc.nextLine();

			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (s.getId().equals(id)) {
					flag = true;
					break;
				}
			}

			if (flag) {
				System.out.println("�������ѧ���Ѿ���ռ��,����������");
			} else {
				break;
			}
		}
		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		System.out.println("������ѧ��סַ��");
		String address = sc.nextLine();

		// ����ѧ������
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		array.add(s);
		//�������е�����д���ļ���
		writeData(Filename,array);

		System.out.println("ѧ����ӳɹ�");
	}

	// ɾ��ѧ����Ϣ
	public static void deleteStudent(String Filename) throws IOException {
		
		//�������ϴ洢ѧ����Ϣ
		ArrayList<Student> array = new ArrayList<Student>();
		//���ļ��е���Ϣ��ȡ��������
		readData(Filename,array);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ����ѧ�ţ�");
		String id = sc.nextLine();

		int index = -1;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getId().equals(id)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("������˼,��Ҫɾ����ѧ�Ŷ�Ӧ��ѧ����Ϣ������,���ȥ�������ѡ��");
		} else {
			array.remove(index);
			//�ٽ������е�Ԫ��д���ļ���
			writeData(Filename,array);
			
			System.out.println("ɾ��ѧ���ɹ�");
		}
	}

	// �޸�ѧ����Ϣ
	public static void updateStudent(String Filename) throws IOException {
		
		//�������ϴ洢ѧ����Ϣ
		ArrayList<Student> array = new ArrayList<Student>();
		//���ļ��е���Ϣ��ȡ��������
		readData(Filename,array);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ�ţ�");
		String id = sc.nextLine();

		int index = -1;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);

			if (s.getId().equals(id)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("������˼,��Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ������,���ȥ�������ѡ��");
		} else {
			System.out.println("�������µ�������");
			String name = sc.nextLine();
			System.out.println("�������µ����䣺");
			String age = sc.nextLine();
			System.out.println("�������µ�סַ��");
			String address = sc.nextLine();

			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);

			array.set(index, s);
			//������д���ļ���
			writeData(Filename,array);
			
			System.out.println("ѧ����Ϣ�޸ĳɹ�");
		}
	}
}
