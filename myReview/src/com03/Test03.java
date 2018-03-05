package com03;

import java.util.ArrayList;

/*
 * 2.定义测试类，在测试类的main函数中完成：
  2.1 实例化4个Car对象，4个对象的属性分别为："Auto"  25，”Audi”  500，"Benz"  700，”BMW”  400。
  2.2 创建一个ArrayList集合，分别将上面的4个Car对象添加到集合中。
  2.3 获取集合中元素的品牌为“B”开头的所有汽车价格总和，并在控制台打印输出

 */
public class Test03 {
	public static void main(String[] args) {
		
		//实例化4个Car对象
		Car c1 = new Car("Auto",25);
		Car c2 = new Car("Audi",500);
		Car c3 = new Car("Benz",700);
		Car c4 = new Car("BMW",400);
		
		//创建一个ArrayList集合，。
		ArrayList<Car> array = new ArrayList<Car>();
		//分别将上面的4个Car对象添加到集合中
		array.add(c1);
		array.add(c2);
		array.add(c3);
		array.add(c4);
		
		//获取集合中元素的品牌为“B”开头的所有汽车价格总和，并在控制台打印输出
		int price = 0;
		for (int i = 0; i < array.size(); i++) {
			Car c = array.get(i);
			if (c.getBrand().startsWith("B")) {
				price += c.getPrice();
			}
		}
		System.out.println("价格总和:"+price);
	}
}
