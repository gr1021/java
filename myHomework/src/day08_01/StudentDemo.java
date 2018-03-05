package day08_01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		while (true) {
			System.out.println("--------简易版学生管理系统主界面-----------");
			System.out.println("1 注册");
			System.out.println("2  登录");
			System.out.println("3 退出");
			System.out.println("请输入你的选择");
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			switch (choiceString) {
			case "1":
				// 注册
				registe(array);
				break;
			case "2":
				// 登录
				login(array);
				break;
			case "3":
				// 退出
			default:
				System.out.println("谢谢您的使用");
				System.exit(0);
				break;
			}

		}
	}

	// 注册
	public static void registe(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i < 3){
		System.out.println("请输入用户名：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		System.out.println("请输入出生日期:");
		String birthday = sc.nextLine();
		System.out.println("请输入你的爱好：");
		String hobby = sc.nextLine();

		Student s = new Student();
		s.setUsername(username);
		s.setPassword(password);
		s.setBirthday(birthday);
		s.setHobby(hobby);

		array.add(s);

		System.out.println("注册成功");
		i++;
	} 
}
	// 登录
	public static void login(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();

		for (int i = 0; i < array.size(); i++) {
			
			if (array.get(i).equals(username)&& array.get(i).equals(password)) {
				
					Student s = array.get(i);
					System.out.println(s.getUsername() + "---" + s.getPassword()
							+ "---" + s.getBirthday() + "---" + s.getHobby());
				
			} else {
				System.out.println("用户名或密码错误");
			}
		}
	}
}
