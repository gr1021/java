package com.itheima05;

/*
 * дһ�����������ڶ����������ͣ������÷�����
 */
public class MethodTest04 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 12, 23, 34, 22, 11 };
		// ��������
		int sum = getSum(arr);

		// ������
		System.out.println("sum:" + sum);
	}

	// дһ����͵ķ���
	/*
	 * ������ȷ�� ����ֵ���ͣ�int 
	 * 			�����б� int[] arr
	 */
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
