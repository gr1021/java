package com.itheima_06;

/*
 * for while ��do...while ������
 * 1��do...while����ִ��һ��ѭ����; ��for��while��Ҫ�����ж�����������ִ��
 * 2��forѭ��������,��ʼ���ı����Ͳ��ܱ�ʹ���ˡ���whileѭ��������,��ʼ���ı��������Լ���ʹ�á�
 * 
 */
public class DoWhileDemo03 {
	public static void main(String[] args) {

		// whileѭ�����
		int x = 3;
		while (x < 3) {
			System.out.println("�ú�ѧϰ����������");
		}
		System.out.println("--------------------------");

		// do...while ѭ�����
		int y = 5;
		do {
			System.out.println("�ú�ѧϰ����������");
			y++;
		} while (y < 5);// ��ʹ������������Ҳ���ӡһ��
		System.out.println("--------------------------");

		// forѭ�������while��������
		for (int i = 1; i < 5; i++) {
			System.out.println("�ú�ѧϰ����������");
		}
		// System.out.println(i);//������Ϊ������i��ʹ�÷�Χ
		System.out.println("--------------------------");

		int j = 3;
		while (j < 6) {
			System.out.println("�ú�ѧϰ����������");
			j++;
		}
		System.out.println(j);
	}
}
