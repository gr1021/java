package com.itheima_02;

/*
 *  ���󣺻�ȡ�����е����ֵ
 */
public class ArrayTest02 {
	public static void main(String[] args) {
		//��������
		int[] arr = {12,23,4,43,54,51};
		
		//�����ֵ
		int max = arr[0];
		for(int i = 1;i < arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("���ֵ��:"+max);
	}
}
