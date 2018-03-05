package Test02;

import java.util.Scanner;

/*
 * 需求：模拟登录
  1.用户名和密码都是admin
  2.如果用户输入的用户名和字码都正确, 提示登陆成功
  3.如果用户名或者密码错误,提示用户还有几次机会
  (例如: 用户名或者密码错误, 您还有2次机会)

 */
public class Task01 {
	public static void main(String[] args) {
		
		//1.用户名和密码都是admin
		String username = "admin";
		String password = "admin";
		
		Scanner sc  =new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
		System.out.println("请输入用户名：");
		String name = sc.nextLine();
		System.out.println("请输入密码：");
		String psw = sc.nextLine();
		
		if (name.equals(username) && psw.equals(password)) {
			System.out.println("登录成功");
			break;
		}else{
			if (2-i == 0) {
				System.out.println("你的用户名和密码已被锁定，请与管理员联系");
			}else{
				System.out.println("登录失败，你还有"+(2-i)+"次机会");
			}
		}
		}
	}
}
