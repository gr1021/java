package com02;

import java.util.ArrayList;
import java.util.Random;

/*
        a. 随机生成8个1-20之间的偶数，存放到合适的集合中；
                PS: 范围包括1和20
        b. 计算出这些随机数的平均值并输出; 
        c. 将小于平均值的数字从集合中删除；

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
		//计算出这些随机数的平均值并输出;
		double avg = sum*1.0 / array.size();
		System.out.println("随机数的平均值:"+avg);
		
		//将小于平均值的数字从集合中删除；
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
