package com.itheima_05;
/*
 * �ֻ���     ��Ա������Ʒ��   �� �۸�   �� ��ɫ����������
 * 		  ��Ա��������绰 �� ������ 
 */
public class Phone {
	private String brand;
	private int price;
	private String color;
	
	
	public Phone(){
		
	}
	
	public Phone(String brand){
		this.brand = brand;
	}
	
	public Phone(int price){
		this.price = price;
	}
	
	public Phone(int price,String color){
		this.color = color;
		this.price = price;
	}
	
	public Phone(String brand, int price, String color){
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	 
	public void show(){
		System.out.println("Ʒ�ƣ�"+brand+"�۸�"+price+"��ɫ��"+color);
	}
}
