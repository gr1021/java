package com.itheima_05;
/*
 * 手机类的测试类
 */
public class PhoneDemo {
	public static void main(String[] args) {
		//创建对象
		Phone p1 = new Phone();
		p1.show();
		
		Phone p2 = new Phone("三星");
		p2.show();
		
		Phone p3 = new Phone(5999);
		p3.show();
		
		Phone p4 = new Phone(5999,"黑色");
		p4.show();
		
		Phone p5 = new Phone("三星",5999,"黑色");
		p5.show();
		
	}
}
