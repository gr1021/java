package com.itheima_04;
/*
 * 手机类的测试类
 */
public class PhoneDemo {
	public static void main(String[] args) {
		//创建对象
		Phone p = new Phone();
		System.out.println(p.getBrand()+"----"+p.getPrice()+"----"+p.getColor());
		
		p.setBrand("苹果");
		p.setPrice(6000);
		p.setColor("黑色");
		
		System.out.println(p.getBrand()+"----"+p.getPrice()+"----"+p.getColor());
		
		p.call("张三");
		p.sendMessage();
	}
}
