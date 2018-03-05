package com_2_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	����һ��������IOUtils�������·�����������������(���²���ֻ��Դ��ı��ļ�(.txt�ļ�))��
	1.copyFile2Dir(String srcFile,String destDir)
	    ����String srcFile:Ҫ���Ƶ�Դ�ļ�
	����String destDir:���Ʋ��������ļ��Ĵ洢·��(Ŀ��·��)
		Ҫ�󣺽�srcFile�ļ����Ƶ�destDirĿ���ļ�����(���ܸı�Դ�ļ�������)
	2.copyDir2Dir(String srcDir,String destDir)
		����File srcDir:Ҫ���Ƶ�Դ�ļ���
		����File destDir:���Ʋ��������ļ��Ĵ洢·��(Ŀ��·��)
		Ҫ�󣺽�srcDir�ļ����е������ļ�(���������ļ���)���Ƶ�destDirĿ���ļ�����(���ܸı�Դ�ļ�������)
 */
public class IOUtils {
	public static void main(String[] args) throws IOException {
		String srcFile = "123.txt";
		String destDir = "abc.txt";
		String srcDir = "123.txt";
		
		copyFile2Dir(srcFile,destDir);
		copyDir2Dir(srcDir,destDir);
	}
	
	//Ҫ�󣺽�srcFile�ļ����Ƶ�destDirĿ���ļ�����(���ܸı�Դ�ļ�������)
	public static void copyFile2Dir(String srcFile,String destDir) throws IOException{
		//��ȡsrcFile�ļ��е�����
		BufferedReader br = new BufferedReader(new FileReader(srcFile));
		//������д����һ���ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter(destDir));
		
		String line;
		while((line = br.readLine())!=null){
			bw.write(line);
		}
		//�ͷ���Դ
		br.close();
		bw.close();
	}
	
	//Ҫ�󣺽�srcDir�ļ����е������ļ�(���������ļ���)
	//���Ƶ�destDirĿ���ļ�����(���ܸı�Դ�ļ�������)
	public static void copyDir2Dir(String srcDir,String destDir) throws IOException{
		//��ȡsrcFile�ļ��е�����
		BufferedReader br = new BufferedReader(new FileReader(srcDir));
		//������д����һ���ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter(destDir));
		
		String line;
		while((line = br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//�ͷ���Դ
		br.close();
		bw.close();
	}
}
