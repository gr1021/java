package com.itheima01;

/*
 * ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 */
public class Test07 {
	public static void main(String[] args) {
		String s = "HelloWorld1234";

		int bCount = 0;
		int sCount = 0;
		int nCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				bCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				sCount++;
			} else if (ch >= '0' && ch <= '9') {
				nCount++;
			} else {
				System.out.println("���ַ�" + ch + "�Ƿ�");
			}
		}
		System.out.println("��д��ĸ��"+bCount+"��");
		System.out.println("Сд��ĸ��"+sCount+"��");
		System.out.println("������"+nCount+"��");
	}
}
