package Test;

import java.util.Scanner;

/*
 * 3. 统计一个键盘录入的字符串中大写字母字符，小写字母字符，数字字符出现的次数。
 举例：Hello520World
 结果：
 大写字母：2
 数字字符：3
 小写字母：8

 */
public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();

		char[] chs = s.toCharArray();
		int bigCount = 0;
		int smallCount = 0;
		int numCount = 0;
		for (int i = 0; i < chs.length; i++) {
			if (chs[i] >= 'A' && chs[i] <= 'Z') {
				bigCount++;
			}else if (chs[i] >= 'a' && chs[i] <= 'z') {
				smallCount++;
			}else if (chs[i] >= '0' && chs[i] <= '9') {
				numCount++;
			}else{
				System.out.println("你输入的字符"+chs+"非法");
			}
		}
		System.out.println("大写字母有"+bigCount+"个");
		System.out.println("数字字符有"+numCount+"个");
		System.out.println("小写字母有"+smallCount+"个");
	}
}
