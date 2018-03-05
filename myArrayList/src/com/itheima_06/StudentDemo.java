package com.itheima_06;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {

		// �������϶���
		ArrayList<Student> array = new ArrayList<Student>();

		while (true) {
			System.out.println("----------��ӭ����ѧ������ϵͳ--------------");
			System.out.println("1 �鿴����ѧ��");
			System.out.println("2 ���ѧ��");
			System.out.println("3 ɾ��ѧ��");
			System.out.println("4 �޸�ѧ��");
			System.out.println("5 �˳�");
			System.out.println("���������ѡ��");

			// ����ѡ��
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();

			// ��switchʵ��ѡ��
			switch (choiceString) {
			case "1":
				// �鿴����ѧ��
				findAllStudent(array);
				break;
			case "2":
				// ���ѧ��
				addStudent(array);
				break;
			case "3":
				// ɾ��ѧ��
				removeStudent(array);
				break;

			case "4":
				// �޸�ѧ��
				updateStudent(array);
				break;
			case "5":
				// �˳�
				// break;
			default:
				System.out.println("лл����ʹ�ã�");
				System.exit(0);
				break;
			}
		}
	}

	// �鿴����ѧ���ķ���ʵ��
	public static void findAllStudent(ArrayList<Student> array) {

		// �����жϼ������Ƿ���ѧ����Ϣ
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

	// ���ѧ���ķ���ʵ��
	public static void addStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		String id;
		while (true) {
			System.out.println("������ѧ��ѧ�ţ�");
			id = sc.nextLine();
			boolean flag = false;

			// �������� �ж���Ҫ��ӵ�ѧ��ѧ���Ƿ��Ѿ�����
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (s.getId().equals(id)) {
					flag = true;
					break;
				}
			}
			if (flag == true) { // ˵�������ѧ���Ѿ�����
				System.out.println("�������ѧ���Ѿ���ռ��,����������");
			} else {
				break;// ˵����ӵ�ѧ�Ų����ڣ������ѭ���������������ݵ�¼��
			}
		}
		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		System.out.println("������ѧ��סַ��");
		String address = sc.nextLine();

		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		array.add(s);
		System.out.println("�ɹ����ѧ����Ϣ");
	}

	// ɾ��ѧ���ķ���ʵ��
	public static void removeStudent(ArrayList<Student> array) {

		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ��:");
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
			System.out.println("ɾ��ѧ���ɹ�");
		}
	}

	// �޸�ѧ���ķ���ʵ��
	public static void updateStudent(ArrayList<Student> array) {

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
			System.out.println("������˼,��Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ������,���ȥ�������ѡ��");
		} else {
			System.out.println("������ѧ���µ�������");
			String name = sc.nextLine();
			System.out.println("������ѧ���µ����䣺");
			String age = sc.nextLine();
			System.out.println("������ѧ���µ�סַ��");
			String address = sc.nextLine();

			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);

			array.set(index, s);

			System.out.println("�޸�ѧ����Ϣ�ɹ�");
		}
	}
}
