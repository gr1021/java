package com.itheima_06;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {

		// 创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();

		while (true) {
			System.out.println("----------欢迎来到学生管理系统--------------");
			System.out.println("1 查看所有学生");
			System.out.println("2 添加学生");
			System.out.println("3 删除学生");
			System.out.println("4 修改学生");
			System.out.println("5 退出");
			System.out.println("请输入你的选择：");

			// 输入选择
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();

			// 用switch实现选择
			switch (choiceString) {
			case "1":
				// 查看所有学生
				findAllStudent(array);
				break;
			case "2":
				// 添加学生
				addStudent(array);
				break;
			case "3":
				// 删除学生
				removeStudent(array);
				break;

			case "4":
				// 修改学生
				updateStudent(array);
				break;
			case "5":
				// 退出
				// break;
			default:
				System.out.println("谢谢您的使用！");
				System.exit(0);
				break;
			}
		}
	}

	// 查看所有学生的方法实现
	public static void findAllStudent(ArrayList<Student> array) {

		// 首先判断集合中是否有学生信息
		if (array.size() == 0) {
			System.out.println("不好意思,目前没有学生信息可供查询,请回去重新选择你的操作");
			return;
		}
		System.out.println("学号\t姓名\t年龄\t住址");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t"
					+ s.getAge() + "\t" + s.getAddress());
		}
	}

	// 添加学生的方法实现
	public static void addStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		String id;
		while (true) {
			System.out.println("请输入学生学号：");
			id = sc.nextLine();
			boolean flag = false;

			// 遍历集合 判断所要添加的学生学号是否已经存在
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (s.getId().equals(id)) {
					flag = true;
					break;
				}
			}
			if (flag == true) { // 说明输入的学号已经存在
				System.out.println("你输入的学号已经被占用,请重新输入");
			} else {
				break;// 说明添加的学号不存在，则结束循环，继续其他数据的录入
			}
		}
		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		System.out.println("请输入学生住址：");
		String address = sc.nextLine();

		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		array.add(s);
		System.out.println("成功添加学生信息");
	}

	// 删除学生的方法实现
	public static void removeStudent(ArrayList<Student> array) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要删除的学号:");
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
			System.out.println("不好意思,你要删除的学号对应的学生信息不存在,请回去重新你的选择");
		} else {
			array.remove(index);
			System.out.println("删除学生成功");
		}
	}

	// 修改学生的方法实现
	public static void updateStudent(ArrayList<Student> array) {

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
			System.out.println("不好意思,你要修改的学号对应的学生信息不存在,请回去重新你的选择");
		} else {
			System.out.println("请输入学生新的姓名：");
			String name = sc.nextLine();
			System.out.println("请输入学生新的年龄：");
			String age = sc.nextLine();
			System.out.println("请输入学生新的住址：");
			String address = sc.nextLine();

			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);

			array.set(index, s);

			System.out.println("修改学生信息成功");
		}
	}
}
