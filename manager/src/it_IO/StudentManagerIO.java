package it_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerIO {
	public static void main(String[] args) throws IOException {

		//����һ���ļ�·��
		String fileName = "students.txt";

		// ѧ������ϵͳ
		while (true) {
			System.out.println("-------------��ӭ����ѧ������ϵͳ������--------------");
			System.out.println("1   �鿴����ѧ������Ϣ");
			System.out.println("2   ���ѧ������Ϣ");
			System.out.println("3   ɾ��ѧ������Ϣ");
			System.out.println("4   �޸�ѧ������Ϣ");
			System.out.println("5   �˳�����ϵͳ");
			System.out.println("���������ѡ��:");

			Scanner sc = new Scanner(System.in);
			String select = sc.nextLine();

			switch (select) {
			case "1":
				// �鿴ѧ����Ϣ
				findAllStudent(fileName);
				break;
			case "2":
				// ���ѧ����Ϣ
				addStudent(fileName);
				break;
			case "3":
				// ɾ��ѧ����Ϣ
				deleteStudent(fileName);
				break;
			case "4":
				// �޸�ѧ����Ϣ
				 setStudent(fileName);
				break;
			case "5":
				// �˳�
			default:
				System.out.println("��ӭ����ʹ��");
				System.exit(0);
				break;
			}
		}
	}
	//��ȡ����
	public static void readData(String fileName,ArrayList<Student> array) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line;
		while((line = br.readLine())!=null){
			String[] st = line.split(",");
			Student s = new Student(st[0],st[1],st[2],st[3]);
			array.add(s);
		}
		br.close();
	}
	public static void writeData(String fileName,ArrayList<Student> array) throws IOException{
		//д����
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

	// ��ѯѧ����Ϣ
	public static void findAllStudent(String fileName) throws IOException {
		
		ArrayList<Student> array = new ArrayList<Student>();
		readData(fileName,array);
		
		// �����жϼ������Ƿ��������
		if (array.size() == 0) {
			System.out.println("��ϵͳ��û��ѧ����Ϣ��������ѡ��");
			return;
		}

		// ��������
		System.out.println("ѧ��\t����\t����\t��ַ");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t"
						+ s.getAge() + "\t" + s.getAddress());
			} 
		}

	// ���ѧ����Ϣ
	public static void addStudent(String fileName) throws IOException {
		
		ArrayList<Student> array = new ArrayList<Student>();
		readData(fileName,array);
		
		// ����¼��
		Scanner sc = new Scanner(System.in);
		String id;
		while (true) {
			System.out.println("������ѧ�ţ�");
			id = sc.nextLine();

			// �жϼ������Ƿ��Ѿ����ڸ�ѧ��
			boolean flag = false;
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (s.getId().equals(id)) {
					flag = true;
					break;
				}
			}
			if (flag==true) {
				System.out.println("�������ѧ���Ѿ���ռ�ã�����������");
			}else{
				break;
			}
		}
			System.out.println("������������");
			String name = sc.nextLine();
			System.out.println("���������䣺");
			String age = sc.nextLine();
			System.out.println("�������ַ��");
			String address = sc.nextLine();

			Student s = new Student(id, name, age, address);
			array.add(s);
			
			//д����
			writeData(fileName,array);
			System.out.println("���ѧ���ɹ�");
			return;
		}
	
	//ɾ��ѧ����Ϣ
	public static void deleteStudent(String fileName) throws IOException {
		
		//������
		ArrayList<Student> array = new ArrayList<Student>();
		readData(fileName,array);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ����ѧ��:");
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
				System.out.println("������˼���������ѧ�Ų�����");
			}else{
				array.remove(index);
				//д����
				writeData(fileName,array);
			    System.out.println("ɾ��ѧ����Ϣ�ɹ�");
			}
	}
	
	//�޸�ѧ����Ϣ
	public static void setStudent(String fileName) throws IOException{
		
		ArrayList<Student> array = new ArrayList<Student>();
		readData(fileName,array);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
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
			System.out.println("�������ѧ�Ų����ڣ�����������");
		}else{
			System.out.println("������������");
			String name = sc.nextLine();
			System.out.println("���������䣺");
			String age = sc.nextLine();
			System.out.println("�������ַ��");
			String address = sc.nextLine();
			
			Student s = new Student(id,name,age,address);
			array.add(index,s);
			//д����
			writeData(fileName,array);
			
			System.out.println("ѧ����Ϣ�޸ĳɹ�");
			
		}
		
	}
}
