package it.lx;


import java.io.FileReader;
import java.io.IOException;

/*
 * ���󣺴��ļ��ж����ݲ���ʾ������̨
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("123.txt");
		
		/*//ͨ��һ�ζ�ȡһ���ַ�ʵ��
		int ch;
		while((ch=fr.read())!=-1){
			System.out.print((char)ch);
		}*/
		
		//ͨ��һ�ζ�ȡһ���ַ�����ʵ��
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1){
			System.out.print(new String(chs,0,len));
		}
		
		fr.close();
	}
}
