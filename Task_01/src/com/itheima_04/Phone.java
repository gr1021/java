package com.itheima_04;
/*
 * �ֻ���     ��Ա������Ʒ��   �� �۸�   �� ��ɫ����������
 * 		  ��Ա��������绰 �� ������ 
 */
public class Phone {
	private String brand;
	private int price;
	private String color;
	
	//Ʒ��
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	//�۸�
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	
	//��ɫ
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	//��绰�ķ���
	public void call(String name){
		System.out.println("��"+name+"��绰");
	}
	
	//�����ŵķ���
	public void sendMessage(){
		System.out.println("Ⱥ������");
	}
}
