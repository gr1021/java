package day07_01;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学员编号：");
		String stuNumber = sc.nextLine();
		
		System.out.println("请输入学员姓名：");
		String name = sc.nextLine();
		
		System.out.println("请输入学员性别：");
		String sex = sc.nextLine();
		
		System.out.println("请输入学员身高：");
		double high = sc.nextDouble();
		
		System.out.println("请输入学员年龄：");
		int age = sc.nextInt();
		
		Student s = new Student(stuNumber,name,sex,high,age);
		System.out.println("学员基本信息为：");
		System.out.print(s.getStuNumber()+"---"+s.getName());
		System.out.println("---"+s.getSex()+"---"+s.getHigh()+"---"+s.getAge());
	}
}
