package com.itheima_01;

/*
 * �ֻ���Ĳ�����
 */
public class PhoneDemo {
	public static void main(String[] args) {
		
		//��������
		Phone p = new Phone();
		
		//���ó�Ա����
		System.out.println(p.brand+"----"+p.price+"----"+p.color);
		
		//����Ա������ֵ
		p.brand = "����";
		p.price = 2000;
		p.color = "��ɫ";
			
		System.out.println(p.brand+"----"+p.price+"----"+p.color);
		
		p.call("����");
		p.sendMessage();
	}
}
