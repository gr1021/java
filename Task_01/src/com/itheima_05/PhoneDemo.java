package com.itheima_05;
/*
 * �ֻ���Ĳ�����
 */
public class PhoneDemo {
	public static void main(String[] args) {
		//��������
		Phone p1 = new Phone();
		p1.show();
		
		Phone p2 = new Phone("����");
		p2.show();
		
		Phone p3 = new Phone(5999);
		p3.show();
		
		Phone p4 = new Phone(5999,"��ɫ");
		p4.show();
		
		Phone p5 = new Phone("����",5999,"��ɫ");
		p5.show();
		
	}
}
