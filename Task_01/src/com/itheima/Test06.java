package com.itheima;

import java.util.Scanner;

/*
 * ����
 * (1)����¼��5��int���͵����ݴ洢����arr��
 * (2)���巽����arr�����е����ݷ�ת
 * (3)���巽���Է�ת���������б���
 */
public class Test06 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������"+(i+1)+"�����ݣ�");
			arr[i] = sc.nextInt();
		}
		
		printArray(arr);
		
		reverse(arr);
		
		printArray(arr);
	}
	public static void printArray(int[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.println(arr[i] +"]");
			}else{
				System.out.print(arr[i] +",");
			}
		}
	}

	public static void reverse(int[] arr){
		for (int start = 0,end =arr.length-1; start < end; start++,end--) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			
		}
	}
}
