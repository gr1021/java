package day08_01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		while (true) {
			System.out.println("--------���װ�ѧ������ϵͳ������-----------");
			System.out.println("1 ע��");
			System.out.println("2  ��¼");
			System.out.println("3 �˳�");
			System.out.println("���������ѡ��");
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			switch (choiceString) {
			case "1":
				// ע��
				registe(array);
				break;
			case "2":
				// ��¼
				login(array);
				break;
			case "3":
				// �˳�
			default:
				System.out.println("лл����ʹ��");
				System.exit(0);
				break;
			}

		}
	}

	// ע��
	public static void registe(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i < 3){
		System.out.println("�������û�����");
		String username = sc.nextLine();
		System.out.println("���������룺");
		String password = sc.nextLine();
		System.out.println("�������������:");
		String birthday = sc.nextLine();
		System.out.println("��������İ��ã�");
		String hobby = sc.nextLine();

		Student s = new Student();
		s.setUsername(username);
		s.setPassword(password);
		s.setBirthday(birthday);
		s.setHobby(hobby);

		array.add(s);

		System.out.println("ע��ɹ�");
		i++;
	} 
}
	// ��¼
	public static void login(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = sc.nextLine();
		System.out.println("���������룺");
		String password = sc.nextLine();

		for (int i = 0; i < array.size(); i++) {
			
			if (array.get(i).equals(username)&& array.get(i).equals(password)) {
				
					Student s = array.get(i);
					System.out.println(s.getUsername() + "---" + s.getPassword()
							+ "---" + s.getBirthday() + "---" + s.getHobby());
				
			} else {
				System.out.println("�û������������");
			}
		}
	}
}
