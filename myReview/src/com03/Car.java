package com03;
/*
 * ����"����"��,Car,�������³�Ա:
    1.��Ա����: brand (Ʒ��)��String����, price (�۸�):int���ͣ�����ʹ��private���Ρ�
            Ϊ���������ṩset/get������
 */
public class Car {
	private String brand;
	private int price;
	
	public Car() {
		
	}

	public Car(String brand, int price) {
		
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
