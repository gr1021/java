package day05_1;

import java.util.Scanner;

/*
 * д������
 *  1.����������֮��(������С��) 
 *	2.�ж����������Ƿ����(������С��) 
 *	3.��ȡ�������нϴ��ֵ(������С��) 
 *	4.��ȡ�������н�С��ֵ(������С��) 
 *	5.������һ������ʵ�� 3 �� 4 ����������
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		double  y = sc.nextDouble();
		
		//1.����������֮��(������С��) 
		double sum = sum(x,y);
		System.out.println("sum:" + sum);
		
		//2.�ж����������Ƿ����(������С��) 
		boolean flag = compare(x,y);
		System.out.println("flag:" + flag);
		
		//3.��ȡ�������нϴ��ֵ(������С��)
		double max = getMax(x,y);
		System.out.println("max:" + max);
		
		//4.��ȡ�������н�С��ֵ(������С��) 
		double min = getMin(x,y);
		System.out.println("min:" + min);
		
		//5.�ܷ���һ������ʵ�� 3 �� 4 ����������
		getMaxMin(x,y);
	}
	public static double sum(int a , double b){
		double c = a + b;
		return c;
	}
	public static boolean compare(int a, double b){
		if (a == b) {
			return true;
		}
		return false;
	}
	public static double getMax(int a, double b){
		if (a > b) {
			return a;
		}
		return b;
	}
	public static double getMin(int a, double b){
		if (a < b) {
			return a;
		}
		return b;
	}
	public static void getMaxMin(int a , double b){
		double max = 0;
		double min = 0;
		//���ֵ
		if (a > b) {
			max = a;
			min = b;
			System.out.println("max:"+max);
			System.out.println("min:"+min);
		}
		
	}
}
