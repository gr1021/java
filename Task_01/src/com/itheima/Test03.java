package com.itheima;

/*
 * ������������,��ڶ�ʮ�����ж���ֻ����
 * ��һ����:1
 * �ڶ�����:1
 * ��������:2
 * ���ĸ���:3
 * �������:5
 * ....
 * int[] arr = new int[20];
 * arr[0] = 1;  arr[1] = 1;
 * arr[2] = arr[1] + arr[0];
 * arr[3] = arr[2] + arr[1];
 * ....
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		int[] arr =new int[20];
		
		int x = count(arr);
		System.out.println(x);
	}
	public static int count(int[] arr){
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		return arr[19];
	}
}
