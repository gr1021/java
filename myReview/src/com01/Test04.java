package com01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 在项目根路径下创建文件 data.txt，data.txt 中存放的数据如下
 * 比如:  2A0a@1wz7qq0EE4#25 
 * （data.txt 文件和文件中的数据可以手动创建和录入，无需由程序生成） 
 * 编写一个程序，获取 data.txt 文件中所有的数字，并在控制台打印输出， 
 演示格式如：文件中所包含的数字有：20170425
 */
public class Test04 {
	public static void main(String[] args) throws IOException {

		// 读取数据
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));

		char[] chs = new char[1024];
		int len;
		System.out.print("文件中所包含的数字有：");
		while((len = br.read(chs))!=-1){
			for (int i = 0; i < chs.length; i++) {
				if (chs[i] >= '0'&&chs[i] <= '9') {
					System.out.print(chs[i]);
				}
			}
		}
	}
}
