package day06;

import java.util.Random;

/*
 * ������� 5 ����Χ��[1,100]������,����Щ���������и�λ��ʮλΪ 3 �����ִ�ӡ���� 
 */
public class Test01 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		//��ȡ�����
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			int x = r.nextInt(100) + 1;
			arr[i] = x;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("------------------------");
		
		//��������
		printNum(arr);
		
	}
	public static void printNum(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 10 == 3) || (arr[i] / 10 % 10 == 3)) {
				System.out.println(arr[i]);
			}
		}
	}
}
