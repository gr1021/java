package com01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 在项目根目录下有一个 test.txt 文件，其内容如下
 * 员序程马黑客播智传 
      ！航起想梦，我自飞放
      （test.txt 文件和文件中的数据可以手动创建和录入，无需由程序生成）
      将文件中的内容读取出来，并反转，打印到控制台。打印格式和内容如下
      传智播客黑马程序员 
        放飞自我，梦想起航！
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		//将文件中的内容读取出来，并反转
		String line;
		while((line =br.readLine())!=null){
			StringBuilder sb = new StringBuilder(line);
			sb.reverse();
			System.out.println(sb);
		}
		br.close();
	}
}
