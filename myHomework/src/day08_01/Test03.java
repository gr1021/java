package day08_01;

import java.util.Scanner;

/*
 * 1.键盘录入一个源字符串由字符串变量 scrStr 接收 
 * 2.键盘录入一个要删除的字符串由字符串变量 delStr 接收 
 * 3、删除该字 scrStr 符串中的所有 delStr 字符串（最终的字符串中不能包含 delStr） ，要
              求打印删除后的结果以及删除了几个 delStr 字符串 
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个源字符串：");
		String scrStr = sc.nextLine();
		System.out.println("请输入一个要删除的字符串：");
		String delStr = sc.nextLine();
		
		
	}
	public static void deleteStr(String s1,String s2){
		int count = 0;
		int index = -1;
		
		index = s1.indexOf(s2);
		if (index == -1) {
			return;
		}else {
			count ++;
			s1.substring(index, index+s2.length());
		}
	}
}
