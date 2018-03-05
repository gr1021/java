package com.itheima_01;

/*
 * Student类的测试类
 */
public class StudentDemo {
	public static void main(String[] args) {

		// 创建对象
		Student s = new Student();

		// 输出成员变量值
		System.out.println(s.name + "-----" + s.age);

		// 给成员变量赋值
		s.name = "赵丽颖";
		s.age = 28;

		// 再次输出成员变量值
		System.out.println(s.name + "-------" + s.age);

		// 调用成员方法
		s.study();
		s.eat();
	}
}
