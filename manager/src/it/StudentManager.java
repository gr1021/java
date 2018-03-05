package it;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {

		// 创建集合存储学生信息
		ArrayList<Student> array = new ArrayList<Student>();

		// 学生管理系统
		while (true) {
			System.out.println("-------------欢迎来到学生管理系统主界面--------------");
			System.out.println("1   查看所有学生的信息");
			System.out.println("2   添加学生的信息");
			System.out.println("3   删除学生的信息");
			System.out.println("4   修改学生的信息");
			System.out.println("5   退出管理系统");
			System.out.println("请输入你的选择:");

			Scanner sc = new Scanner(System.in);
			String select = sc.nextLine();

			switch (select) {
			case "1":
				// 查看学生信息
				findAllStudent(array);
				break;
			case "2":
				// 添加学生信息
				addStudent(array);
				break;
			case "3":
				// 删除学生信息
				deleteStudent(array);
				break;
			case "4":
				// 修改学生信息
				 setStudent(array);
				break;
			case "5":
				// 退出
			default:
				System.out.println("欢迎您的使用");
				System.exit(0);
				break;
			}
		}
	}

	// 查询学生信息
	public static void findAllStudent(ArrayList<Student> array) {

		// 首先判断集合中是否存在数据
		if (array.size() == 0) {
			System.out.println("该系统中没有学生信息，请重新选择！");
			return;
		}

		// 遍历集合
		System.out.println("学号\t姓名\t年龄\t地址");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t"
						+ s.getAge() + "\t" + s.getAddress());
			} 
		}

	// 添加学生信息
	public static void addStudent(ArrayList<Student> array) {

		// 键盘录入
		Scanner sc = new Scanner(System.in);
		String id;
		while (true) {
			System.out.println("请输入学号：");
			id = sc.nextLine();

			// 判断集合中是否已经存在该学号
			boolean flag = false;
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (s.getId().equals(id)) {
					flag = true;
					break;
				}
			}
			if (flag==true) {
				System.out.println("你输入的学号已经被占用，请重新输入");
			}else{
				break;
			}
		}
			System.out.println("请输入姓名：");
			String name = sc.nextLine();
			System.out.println("请输入年龄：");
			String age = sc.nextLine();
			System.out.println("请输入地址：");
			String address = sc.nextLine();

			Student s = new Student(id, name, age, address);
			array.add(s);
			System.out.println("添加学生成功");
			return;
		}
	
	//删除学生信息
	public static void deleteStudent(ArrayList<Student> array) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要删除的学生的学号:");
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
				System.out.println("不好意思，你输入的学号不存在");
			}else{
				array.remove(index);
			    System.out.println("删除学生信息成功");
			}
	}
	
	//修改学生信息
	public static void setStudent(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要修改的学生的学号：");
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
			System.out.println("你输入的学号不存在，请重新输入");
		}else{
			System.out.println("请输入姓名：");
			String name = sc.nextLine();
			System.out.println("请输入年龄：");
			String age = sc.nextLine();
			System.out.println("请输入地址：");
			String address = sc.nextLine();
			
			Student s = new Student(id,name,age,address);
			array.add(index,s);
			System.out.println("学生信息修改成功");
			
		}
		
	}
}
