package com.itheima_01;

/*
 * 手机类的测试类
 */
public class PhoneDemo {
	public static void main(String[] args) {
		
		//创建对象
		Phone p = new Phone();
		
		//调用成员变量
		System.out.println(p.brand+"----"+p.price+"----"+p.color);
		
		//给成员变量赋值
		p.brand = "三星";
		p.price = 2000;
		p.color = "黑色";
			
		System.out.println(p.brand+"----"+p.price+"----"+p.color);
		
		p.call("张三");
		p.sendMessage();
	}
}
