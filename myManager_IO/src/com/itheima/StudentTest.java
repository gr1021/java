package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * IO版的学生管理系统
 */
public class StudentTest {
	public static void main(String[] args) throws IOException {
		//定义一个文件路径变量
		String Filename = "students.txt";
		
		while (true) {
			System.out.println("--------------欢迎来到学生管理系统主界面----------------------");
			System.out.println("1 查看所有学生信息");
			System.out.println("2 添加学生信息");
			System.out.println("3 删除学生信息");
			System.out.println("4 修改学生信息");
			System.out.println("5 退出管理系统");
			System.out.println("请输入你的选择：");

			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();

			switch (choiceString) {
			case "1":
				// 查看所有学生的信息
				findAllStudent(Filename);
				break;
			case "2":
				// 添加学生信息
				addStudent(Filename);
				break;
			case "3":
				// 删除学生信息
				deleteStudent(Filename);
				break;
			case "4":
				// 修改学生信息
				updateStudent(Filename);
				break;
			case "5":
				// 退出
			default:
				System.out.println("谢谢您的使用");
				System.exit(0);
				break;
			}
		}
	}
	//读取数据
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
	
	//写数据到文本文件中
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
	
	// 查看所有学生的信息
	public static void findAllStudent(String Filename) throws IOException {
		
		//创建集合存储学生信息
		ArrayList<Student> array = new ArrayList<Student>();
		//把文件中的信息读取到集合中
		readData(Filename,array);
		
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

	// 添加学生信息
	public static void addStudent(String Filename) throws IOException {
		
		//创建集合存储学生信息
		ArrayList<Student> array = new ArrayList<Student>();
		//把文件中的信息读取到集合中
		readData(Filename,array);
		
		Scanner sc = new Scanner(System.in);

		String id;
		while (true) {
			boolean flag = false;
			System.out.println("请输入学生学号：");
			id = sc.nextLine();

			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (s.getId().equals(id)) {
					flag = true;
					break;
				}
			}

			if (flag) {
				System.out.println("你输入的学号已经被占用,请重新输入");
			} else {
				break;
			}
		}
		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		System.out.println("请输入学生住址：");
		String address = sc.nextLine();

		// 创建学生对象
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		array.add(s);
		//将集合中的数据写到文件中
		writeData(Filename,array);

		System.out.println("学生添加成功");
	}

	// 删除学生信息
	public static void deleteStudent(String Filename) throws IOException {
		
		//创建集合存储学生信息
		ArrayList<Student> array = new ArrayList<Student>();
		//把文件中的信息读取到集合中
		readData(Filename,array);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要删除的学生的学号：");
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
			//再将集合中的元素写到文件中
			writeData(Filename,array);
			
			System.out.println("删除学生成功");
		}
	}

	// 修改学生信息
	public static void updateStudent(String Filename) throws IOException {
		
		//创建集合存储学生信息
		ArrayList<Student> array = new ArrayList<Student>();
		//把文件中的信息读取到集合中
		readData(Filename,array);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要修改的学号：");
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
			System.out.println("请输入新的姓名：");
			String name = sc.nextLine();
			System.out.println("请输入新的年龄：");
			String age = sc.nextLine();
			System.out.println("请输入新的住址：");
			String address = sc.nextLine();

			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);

			array.set(index, s);
			//将数据写到文件中
			writeData(Filename,array);
			
			System.out.println("学生信息修改成功");
		}
	}
}
