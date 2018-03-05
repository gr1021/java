package com.itheima_03;
/*
 * 手机类的测试类
 */
public class PhoneDemo {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.show();
		
		Phone p2 = new Phone("三星",2999);  
		p2.show();
		
		Phone p3 = new Phone("三星",2999,"棕色");
	}
}
