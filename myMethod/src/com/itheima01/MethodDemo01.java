package com.itheima01;

/*
 * �ӷ��ķ���
 * 
 * ������ȷ��
 * 		����ֵ����  int
 *      �����б�  int a , int b
 */
public class MethodDemo01 {
	public static void main(String[] args) {
		//��������
		//����ȷ����ֵ���͵ķ���
		//�������ã�û������
		sum(10,20);
		
		//�������
		System.out.println(sum(10,20));
		
		//��ֵ����
		int result = sum(10,20);
		System.out.println("------------------");
		System.out.println(result);
	}
	public static int sum(int a ,int b){
		int c = a + b;
		return c;
	}
}
