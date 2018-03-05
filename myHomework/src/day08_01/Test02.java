package day08_01;

import java.util.Scanner;

/*
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个大字符串：");
		String str1 = sc.nextLine();
		System.out.println("请输入一个小字符串：");
		String str2 = sc.nextLine();

		int x = count(str1, str2);
		System.out.println(x);
	}
//woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma 
	public static int count(String str1, String str2) {
		int count = 0;

		while (true) {
			int index = str1.indexOf(str2);
			if (index == -1) {
				break;
			} else {
				count++;
				index += str2.length();
				str1 = str1.substring(index);
			}
		}
		return count;
	}
}
