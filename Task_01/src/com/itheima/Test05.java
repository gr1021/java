package com.itheima;

import java.util.Scanner;

/*
 *  �����ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
 * ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ��4����ίƽ��ֵ��
 * ��д����ʵ�֡�(������С������)
 */
public class Test05 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		//����¼������
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������"+(i+1)+"����ί�����ķ���");
			int score = sc.nextInt();
			arr[i] = score;
		}
		
		//��������
		int sum = sum(arr);
		int max = getMax(arr);
		int min = getMin(arr);
		
		double avg = (sum -max - min) / (arr.length -2);
		System.out.println("���÷��ǣ�" + avg);
	}
	
	//���ܺͷ���
	public static int sum(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//�����ֵ����
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//����Сֵ����
	public static int getMin(int[] arr){
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
