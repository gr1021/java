package day08_01;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现 
 * 1.键盘录入一个大字符串,再录入一个小字符串 
 * 2.统计小字符串在大字符串中出现的次数 
 * 3.代码运行打印格式:
 * 大字符串:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma 
 * 小字符串:heima 
 */
public class Test02 {
	public static void main(String[] args) {
		// 1.键盘录入一个大字符串,再录入一个小字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入大字符串：");
		String s1 = sc.nextLine();
		System.out.println("请输入小字符串：");
		String s2 = sc.nextLine();
		
		// 2.统计小字符串在大字符串中出现的次数
		int count = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)=='h'&&s1.charAt(i+1)=='e'&&s1.charAt(i+2)=='i') {
				if (s1.charAt(i+3)=='m'&&s1.charAt(i+4)=='a') {
					count++;
				}
			}
		}
		System.out.println("小字符串"+s2+",在大字符串"+s1+"中共出现"+count+"次");
		
	}
}
