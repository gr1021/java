package com.itheima01;

import java.util.Scanner;

/*
 * ����¼��һ���ַ������Ѹ��ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
 */
public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		String s1 = s.substring(0,1);
		String s2 = s.substring(1);
		String s3 = s1.toUpperCase() + s2.toLowerCase();
		System.out.println("s3:"+s3);
	}
}
