package day07_01;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧԱ��ţ�");
		String stuNumber = sc.nextLine();
		
		System.out.println("������ѧԱ������");
		String name = sc.nextLine();
		
		System.out.println("������ѧԱ�Ա�");
		String sex = sc.nextLine();
		
		System.out.println("������ѧԱ��ߣ�");
		double high = sc.nextDouble();
		
		System.out.println("������ѧԱ���䣺");
		int age = sc.nextInt();
		
		Student s = new Student(stuNumber,name,sex,high,age);
		System.out.println("ѧԱ������ϢΪ��");
		System.out.print(s.getStuNumber()+"---"+s.getName());
		System.out.println("---"+s.getSex()+"---"+s.getHigh()+"---"+s.getAge());
	}
}
