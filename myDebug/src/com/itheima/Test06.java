package com.itheima;

import java.util.Scanner;

/*
 * �����ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
 * ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ��4����ίƽ��ֵ��
 * ��д����ʵ�֡�(������С������)
 */
public class Test06 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		//��������
		addNumber(arr);
		int max = getMax(arr);
		int min = getMin(arr);
		int sum = sum(arr);

		double avg = (sum - max - min) / (arr.length - 2);
		System.out.println("���÷��ǣ�" + avg);
	}

	// ����¼�����ݵķ���
	public static void addNumber(int[] arr) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������" + (i + 1) + "������:");
			int score = sc.nextInt();
			
			if (score > 100 || score < 0) {
				i--;
				continue;
			}else {
				arr[i] = score;
			}
		}
	}

	// �����ֵ�ķ���
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// ��ȡ��Сֵ�ķ���
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// ��ȡ�ܺ͵ķ���
	public static int sum(int[] arr) {
		int sum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
