package com.itheima05;

/*
 * �ѻ�ȡ������ֵ�Ľ�Ϊ����ʵ�֣������÷���
 */
public class MethodTest02 {
	public static void main(String[] args) {
		//����һ������
		int[] arr ={12,34,23,45,22};
		// ��������
		int max = getMax(arr);
		System.out.println("max:" + max);
		
	}
	//��ͷ���
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
