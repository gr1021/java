package com.itheima_03;

/*
 * ��ά���飺����Ԫ��Ϊһά��������顣
 * 
 * �����ʽ����������[][] ������;
 *		��̬��ʼ����
 *��������[][] ������ = new ��������[m][n];
 *		��̬��ʼ����
 *�򻯸�ʽ�� ��������[][] ������ = {{Ԫ��...},{Ԫ��...},{Ԫ��...},...};
 */
public class ArrayArrayDemo {
	public static void main(String[] args) {
		//�����ά����
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		//���
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][2]);
	}
}
