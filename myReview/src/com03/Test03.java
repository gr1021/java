package com03;

import java.util.ArrayList;

/*
 * 2.��������࣬�ڲ������main��������ɣ�
  2.1 ʵ����4��Car����4����������Էֱ�Ϊ��"Auto"  25����Audi��  500��"Benz"  700����BMW��  400��
  2.2 ����һ��ArrayList���ϣ��ֱ������4��Car������ӵ������С�
  2.3 ��ȡ������Ԫ�ص�Ʒ��Ϊ��B����ͷ�����������۸��ܺͣ����ڿ���̨��ӡ���

 */
public class Test03 {
	public static void main(String[] args) {
		
		//ʵ����4��Car����
		Car c1 = new Car("Auto",25);
		Car c2 = new Car("Audi",500);
		Car c3 = new Car("Benz",700);
		Car c4 = new Car("BMW",400);
		
		//����һ��ArrayList���ϣ���
		ArrayList<Car> array = new ArrayList<Car>();
		//�ֱ������4��Car������ӵ�������
		array.add(c1);
		array.add(c2);
		array.add(c3);
		array.add(c4);
		
		//��ȡ������Ԫ�ص�Ʒ��Ϊ��B����ͷ�����������۸��ܺͣ����ڿ���̨��ӡ���
		int price = 0;
		for (int i = 0; i < array.size(); i++) {
			Car c = array.get(i);
			if (c.getBrand().startsWith("B")) {
				price += c.getPrice();
			}
		}
		System.out.println("�۸��ܺ�:"+price);
	}
}
