package com02;

import java.util.ArrayList;
import java.util.Random;

/*
        a. �������8��1-20֮���ż������ŵ����ʵļ����У�
                PS: ��Χ����1��20
        b. �������Щ�������ƽ��ֵ�����; 
        c. ��С��ƽ��ֵ�����ִӼ�����ɾ����

 */
public class Test01 {
	public static void main(String[] args) {
		
		Random r = new Random();
		ArrayList<Integer> array = new ArrayList<Integer>();
		int num ;
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			num = r.nextInt(20)+1;
			if (num % 2 == 0) {
				array.add(num);
				sum += num;
			}else {
				i--;
			}
		}
		System.out.println(array);
		//�������Щ�������ƽ��ֵ�����;
		double avg = sum*1.0 / array.size();
		System.out.println("�������ƽ��ֵ:"+avg);
		
		//��С��ƽ��ֵ�����ִӼ�����ɾ����
		for (int i = 0; i <array.size(); i++) {
			Double x = new Double(array.get(i));
			if (x < avg) {
				array.remove(i);
				i--;
			}
		}
		System.out.println(array);
		
		
	}
}
