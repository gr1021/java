package com.itheima_03;
/*
 * �ֻ���       ��Ա����   Ʒ��  �۸�  ��ɫ
 * 		  ��Ա����   ��绰   ������
 */
public class Phone {
	private String brand;
	private int price;
	private String color;
	public Phone() {
		
	}
	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	public Phone(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public void show(){
		System.out.println("Ʒ�ƣ�"+brand+" �۸�"+price+" ��ɫ:"+price);
	}
	
}
