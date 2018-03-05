package com.itheima_04;
/*
 * 手机类     成员变量：品牌   ， 价格   ， 颜色。。。。。
 * 		  成员方法：打电话 ， 发短信 
 */
public class Phone {
	private String brand;
	private int price;
	private String color;
	
	//品牌
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	//价格
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	
	//颜色
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	//打电话的方法
	public void call(String name){
		System.out.println("给"+name+"打电话");
	}
	
	//发短信的方法
	public void sendMessage(){
		System.out.println("群发短信");
	}
}
