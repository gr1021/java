package com.itheima_01;

/*
 * �ֻ���ĵĳ�Ա������Ʒ��   �۸�  ��ɫ
 * 		   ��Ա������ ��绰   ������
 */
public class Phone {
	// Ʒ��
	String brand;
	// �۸�
	int price;
	// ��ɫ
	String color;
	
	//��绰�ķ���
	public void call(String name){
		System.out.println("��"+name+"��绰");
	}
	//�����ŵķ���
	public void sendMessage(){
		System.out.println("Ⱥ������");
	}
}
