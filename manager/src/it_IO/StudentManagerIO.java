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

		//创建一个文件路径
		String fileName = "students.txt";

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
				findAllStudent(fileName);
				break;
			case "2":
				// 添加学生信息
				addStudent(fileName);
				break;
			case "3":
				// 删除学生信息
				deleteStudent(fileName);
				break;
			case "4":
				// 修改学生信息
				 setStudent(fileName);
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
	//读取数据
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
		//写数据
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

	// 查询学生信息
	public static void findAllStudent(String fileName) throws IOException {
		
		ArrayList<Student> array = new ArrayList<Student>();
		readData(fileName,array);
		
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
	public static void addStudent(String fileName) throws IOException {
		
		ArrayList<Student> array = new ArrayList<Student>();
		readData(fileName,array);
		
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
			
			//写数据
			writeData(fileName,array);
			System.out.println("添加学生成功");
			return;
		}
	
	//删除学生信息
	public static void deleteStudent(String fileName) throws IOException {
		
		//读数据
		ArrayList<Student> array = new ArrayList<Student>();
		readData(fileName,array);
		
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
				//写数据
				writeData(fileName,array);
			    System.out.println("删除学生信息成功");
			}
	}
	
	//修改学生信息
	public static void setStudent(String fileName) throws IOException{
		
		ArrayList<Student> array = new ArrayList<Student>();
		readData(fileName,array);
		
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
			//写数据
			writeData(fileName,array);
			
			System.out.println("学生信息修改成功");
			
		}
		
	}
}
