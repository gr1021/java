package com01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 在项目根路径创建 data.txt 文件（文件的创建和文件内容的输入可手动创建和录入）,文件
	内容没有要求
	使用 IO 流获取 data.txt 文件内容 中的所有 数字。 
	将获取到的所有数字 使用 IO 流写入 到文件 result.txt 文件中
	例：data.txt 文件内容：as12qwq21Q2aed 
          最终保存至 result.txt 文件的内容：12212 
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
		//使用 IO 流获取 data.txt 文件内容 中的所有 数字。
		char[] chs = new char[1024];
		int len ;
		char ch;
		while((len=br.read(chs))!=-1){
			for (int i = 0; i < chs.length; i++) {
				if (chs[i] >= '0'&&chs[i]<= '9') {
					bw.write(chs[i]);
				}
			}
		}
		br.close();
		bw.close();
				
	}
}
