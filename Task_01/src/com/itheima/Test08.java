package com.itheima;

import java.util.Random;

/*
 * ����10���������1-100֮��  �������ظ������ֳ���
 */
public class Test08 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		Random r =new Random();
		
			for (int i = 0; i < arr.length; i++) {
				int num = r.nextInt(100) + 1;
				if (isHave(arr,num)) {
					i--;
					continue;
				}else{
					arr[i]=num;
				}
			}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	public static boolean isHave(int[] arr, int num ){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num){
				return true;
			}
		}
		return false;
	}
}
