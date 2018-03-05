package day08_01;

import java.util.Scanner;

/*
 * 分析以下需求,并用代码实现
 * 	1.键盘录入一个源字符串由字符串变量 scrStr 接收 
 *  2.键盘录入一个要删除的字符串由字符串变量 delStr 接收 
 *  3.要求
 *  	删除该字 scrStr 符串中的所有 delStr 字符串（最终的字符串中不能包含 delStr） ，要
求打印删除后的结果以及删除了几个 delStr 字符串 

		4.代码运行打印格式: 
		请输入源字符串:java woaijava,i like jajavava i enjoy java 
		请输入要删除的字符串:java 
		控制台输出结果:源字符串中总共包含:5 个 java 删除java后的字符串为: woai,i like  
i enjoy 
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入源字符串：");
		String scrStr = sc.nextLine();
		System.out.println("请输入要删除的字符串：");
		String delStr = sc.nextLine();
		
		
	}
}
