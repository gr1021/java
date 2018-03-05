package com01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 项目需求：
 * 请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
 * 可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("请输入信息：");
			String str = sc.nextLine();
			if (str.equals("886")) {
				break;
			}
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("Info.txt",true));
			
			bw.write(str);
			bw.newLine();
			bw.close();
			
			
		}
		
	}
}
