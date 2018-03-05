package com02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*	定义一个存储Student对象的集合；
 循环3次，从控制台接收3名学员信息，每条信息封装一个Student对象，将每个Student对象存储到集合中。
 遍历集合，获取每个Student对象，取出所有属性值，输出到文件Test2_2.txt中。每名学员信息占一行

 */
public class Test02 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		ArrayList<Student> array = new ArrayList<Student>();

		for (int i = 0; i < 3; i++) {
			System.out.println("请输入学号：");
			String id = sc.nextLine();
			System.out.println("请输入姓名：");
			String name = sc.nextLine();
			System.out.println("请输入性别：");
			String sex = sc.nextLine();
			System.out.println("请输入年龄：");
			String age = sc.nextLine();
			Student s = new Student(id, name, sex, age);
			array.add(s);
		}
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "---" + s.getName() + "---"
					+ s.getSex() + "---" + s.getAge());
			// 输出到文件Test2_2.txt中
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("Test2_2.txt",true));

			bw.write(s.getId());
			bw.write("---");
			bw.write(s.getName());
			bw.write("---");
			bw.write(s.getSex());
			bw.write("---");
			bw.write(s.getAge());
			bw.newLine();
			bw.close();

		}

	}
}
