package com03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 需求说明：
 * 将文件name.txt中的数据“卢俊义”修改为：“史文恭”。
 *
 2.	循环从文件中读取数据，每次读取一行，并解析每个属性值，封装到一个Student对象中，并将这个对象封装到集合中。
 3.	遍历集合，找到要修改的“卢俊义”，并将姓名修改为：“史文恭”。
 同时将数据再次写回到文件中。
 4.	程序结束后，验证文件中的数据是否修改成功。

 */
public class Test03 {
	public static void main(String[] args) throws IOException {

		// 定义一个存储Student对象的集合
		ArrayList<Student> array = new ArrayList<Student>();

		// 创建输入缓冲流的对象
		BufferedReader br = new BufferedReader(new FileReader("name.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			String[] str = line.split(",");
			Student s = new Student(str[0],str[1],str[2],str[3]);
			array.add(s);
		}
		//遍历集合
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getName().equals("卢俊义")) {
				s.setName("史文恭");
			}
			System.out.println(s.getId()+"---"+s.getName()+"---"+s.getSex()+"---"+s.getAge());
		}
		br.close();
		//同时将数据再次写回到文件中
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("name.txt"));
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getSex()).append(",").append(s.getAge());
			
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
