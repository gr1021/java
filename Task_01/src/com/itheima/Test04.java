package com.itheima;

/*
 *  ����
 * (1)����һ��int���͵�һά���飬����Ϊ{171,72,19,16,118,51,210,7,18}
 * (2)���������������Ҫ���Ԫ�غ͡�
 * 		Ҫ����͵�Ԫ�صĸ�λ��ʮλ���ܰ���7,����ֻ��Ϊż����
 */
public class Test04 {
	public static void main(String[] args) {
		int[] arr = {171,72,19,16,118,51,210,7,18};
		
		int sum = sum(arr);
		System.out.println("sum:" + sum);
	}
	public static int sum(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 10 != 7 && arr[i] /10 %10!=7 && arr[i]%2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
}
