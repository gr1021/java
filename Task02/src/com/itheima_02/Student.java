package com.itheima_02;
/*
 * ѧ����
 */
public class Student {
	//��Ա����
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
		
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if (age < 0 || age > 150) {
			System.out.println("����������䲻��ȷ");
		}else{
		this.age = age;
		}
	}
	
}
