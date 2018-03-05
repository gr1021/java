package com_2_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	定义一个工具类IOUtils，有以下方法，方法描述如下(以下操作只针对纯文本文件(.txt文件))：
	1.copyFile2Dir(String srcFile,String destDir)
	    参数String srcFile:要复制的源文件
	参数String destDir:复制产生的新文件的存储路径(目标路径)
		要求：将srcFile文件复制到destDir目标文件夹中(不能改变源文件的名称)
	2.copyDir2Dir(String srcDir,String destDir)
		参数File srcDir:要复制的源文件夹
		参数File destDir:复制产生的新文件的存储路径(目标路径)
		要求：将srcDir文件夹中的所有文件(不包含子文件夹)复制到destDir目标文件夹中(不能改变源文件的名称)
 */
public class IOUtils {
	public static void main(String[] args) throws IOException {
		String srcFile = "123.txt";
		String destDir = "abc.txt";
		String srcDir = "123.txt";
		
		copyFile2Dir(srcFile,destDir);
		copyDir2Dir(srcDir,destDir);
	}
	
	//要求：将srcFile文件复制到destDir目标文件夹中(不能改变源文件的名称)
	public static void copyFile2Dir(String srcFile,String destDir) throws IOException{
		//读取srcFile文件中的内容
		BufferedReader br = new BufferedReader(new FileReader(srcFile));
		//将内容写到另一个文件
		BufferedWriter bw = new BufferedWriter(new FileWriter(destDir));
		
		String line;
		while((line = br.readLine())!=null){
			bw.write(line);
		}
		//释放资源
		br.close();
		bw.close();
	}
	
	//要求：将srcDir文件夹中的所有文件(不包含子文件夹)
	//复制到destDir目标文件夹中(不能改变源文件的名称)
	public static void copyDir2Dir(String srcDir,String destDir) throws IOException{
		//读取srcFile文件中的内容
		BufferedReader br = new BufferedReader(new FileReader(srcDir));
		//将内容写到另一个文件
		BufferedWriter bw = new BufferedWriter(new FileWriter(destDir));
		
		String line;
		while((line = br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//释放资源
		br.close();
		bw.close();
	}
}
