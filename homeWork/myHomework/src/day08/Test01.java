package day08;

import java.util.Scanner;

/*
 * 一、需求说明：请用户输入一个“QQ 号码” ，我们来判断这个 QQ 号码是否正确。  
 * 要求：使用方法来完成判断功能。 
 * 
 * 
 * 
 * */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串数字：");
		String QQ = sc.nextLine();

		boolean flag = checkQQ(QQ);
		System.out.println("flag:" + flag);

	}

	public static boolean checkQQ(String qq) {
		/*
		 * 1)必须是 5—12 位数字； 2) 首位不能是 0；
		 */
		String ss = new String(qq);
		if (ss.length() >= 5 && ss.length() <= 12) {
			for (int i = 0; i < ss.length(); i++) {
				if (ss.charAt(0) != '0' && ss.charAt(i) >= '0' && ss.charAt(i) <= '9') {
					return true;
				}else{
					return false;
				}
			}	
		}
		return false;
	}
}
