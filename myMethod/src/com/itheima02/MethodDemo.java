package com.itheima02;

/*
 * �ڿ���̨���10��HelloWorld
 */
public class MethodDemo {
	public static void main(String[] args) {
		
		//��������   �޷���ֵ���͵ķ���ֻ�ܵ�������
		print();
		System.out.println("--------------");
		print1(3);
	}
	//�޲���
	public static void print(){
		for (int i = 0; i < 10; i++) {
			System.out.println("HelloWorld");
		}
	}
	//�в���
	public static void print1(int n){
		for (int i = 0; i < n; i++) {
			System.out.println("HelloWorld");
		}
	}
}
