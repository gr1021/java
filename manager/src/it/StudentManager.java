package it;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {

		// �������ϴ洢ѧ����Ϣ
		ArrayList<Student> array = new ArrayList<Student>();

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
				findAllStudent(array);
				break;
			case "2":
				// ���ѧ����Ϣ
				addStudent(array);
				break;
			case "3":
				// ɾ��ѧ����Ϣ
				deleteStudent(array);
				break;
			case "4":
				// �޸�ѧ����Ϣ
				 setStudent(array);
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

	// ��ѯѧ����Ϣ
	public static void findAllStudent(ArrayList<Student> array) {

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
	public static void addStudent(ArrayList<Student> array) {

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
			System.out.println("���ѧ���ɹ�");
			return;
		}
	
	//ɾ��ѧ����Ϣ
	public static void deleteStudent(ArrayList<Student> array) {

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
			    System.out.println("ɾ��ѧ����Ϣ�ɹ�");
			}
	}
	
	//�޸�ѧ����Ϣ
	public static void setStudent(ArrayList<Student> array){
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
			System.out.println("ѧ����Ϣ�޸ĳɹ�");
			
		}
		
	}
}
