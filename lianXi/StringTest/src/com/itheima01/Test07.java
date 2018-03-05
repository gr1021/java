package com.itheima01;

/*
 * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 */
public class Test07 {
	public static void main(String[] args) {
		String s = "HelloWorld1234";

		int bCount = 0;
		int sCount = 0;
		int nCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				bCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				sCount++;
			} else if (ch >= '0' && ch <= '9') {
				nCount++;
			} else {
				System.out.println("该字符" + ch + "非法");
			}
		}
		System.out.println("大写字母有"+bCount+"个");
		System.out.println("小写字母有"+sCount+"个");
		System.out.println("数字有"+nCount+"个");
	}
}
