package com.itheima_04;
/*
 * �ֻ���Ĳ�����
 */
public class PhoneDemo {
	public static void main(String[] args) {
		//��������
		Phone p = new Phone();
		System.out.println(p.getBrand()+"----"+p.getPrice()+"----"+p.getColor());
		
		p.setBrand("ƻ��");
		p.setPrice(6000);
		p.setColor("��ɫ");
		
		System.out.println(p.getBrand()+"----"+p.getPrice()+"----"+p.getColor());
		
		p.call("����");
		p.sendMessage();
	}
}
