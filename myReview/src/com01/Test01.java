package com01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 项目根路径下创建文件 Test05.txt，Test05.txt 中存放如下数据
 * ADGdadfFSA 
 * FDDS324dfa 
 * 1232da3daA
 * 编写程序，获取 Test05.txt 文件中内容，统计读取的内容中是字母的个数（大写
	字母和小写字母都要统计），并将获取的结果在控制台打印输出 
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		
		//项目根路径下创建文件 Test05.txt
		BufferedWriter bw = new BufferedWriter(new FileWriter("Test05.txt"));
		
		bw.write("ADGdadfFSA");
		bw.newLine();
		bw.write("FDDS324dfa");
		bw.newLine();
		bw.write("1232da3daA");
		bw.close();
		
		//获取 Test05.txt 文件中内容，统计读取的内容中是字母的个数
		BufferedReader br = new BufferedReader(new FileReader("Test05.txt"));
		
		char[] chs = new char[1024];
		int len;
		int count = 0;
		while((len = br.read(chs))!=-1){
			for (int i = 0; i < chs.length; i++) {
				if (chs[i]>='A'&&chs[i]<='Z' || chs[i]>='a'&&chs[i]<='z') {
					count++;
				}
			}
		}
		System.out.println("内容中字母的个数："+count);
		
		br.close();
	}
}
