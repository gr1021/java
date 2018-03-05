package com.itheima_03;
/*
 * 手机类       成员变量   品牌  价格  颜色
 * 		  成员方法   打电话   发短信
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
		System.out.println("品牌："+brand+" 价格："+price+" 颜色:"+price);
	}
	
}
