package day04;

import java.util.Random;

/*
 * 2. �����ȡ�����е�һ��ֵ
 * 
 * ������ 1������һ������
 * 	    2����ȡһ�����������Χ�����鳤��һ��
 * 		3����������ȡ���������ֵ
 */
public class Test02 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 12, 14, 13, 23, 34 };

		Random r = new Random();
		int i = r.nextInt(arr.length);

		System.out.println(arr[i]);
	}
}
