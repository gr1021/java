package day05_1;

import java.util.Scanner;

/*
 * ����һ�����󣬲��ô���ʵ��
 * 1������¼�볤���εĳ��Ϳ�
 * 		���巽������ó����ε��ܳ�������main�����д�ӡ�ܳ�
 * 2������¼�볤���εĳ��Ϳ�
 * 		���巽������ó����ε����������main�����д�ӡ���
 * 3������¼��Բ�İ뾶
 * 		���巽�������Բ���ܳ�������main�����д�ӡ�ܳ�
 * 4������¼��Բ�İ뾶
 * 		���巽�������Բ�����������main�����д�ӡ���
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//�����εĳ�
		System.out.println("�������һ�����ݣ�");
		int chang = sc.nextInt();
		
		//�����εĿ�
		System.out.println("������ڶ������ݣ�");
		int kuan = sc.nextInt();
		
		//���ó������ܳ��ķ���
		int perimeter = perimeter(chang,kuan);
		System.out.println("�����ε��ܳ��ǣ�"+perimeter);
		
		//���ó���������ķ���
		int area = area(chang , kuan);
		System.out.println("�����ε�����ǣ�" + area);
		
		//Բ�İ뾶
		System.out.println("��������������ݣ�");
		int r = sc.nextInt();
		
		//����Բ���ܳ��ķ���
		double perimeter1 = perimeter(r);
		System.out.println("Բ���ܳ��ǣ�" + perimeter1);
		
		//����Բ������ķ���
		double area1 = area(r);
		System.out.println("Բ������ǣ�" + area1);
		
	}
	
	//���㳤���ε��ܳ��ķ���
	public static int perimeter(int a ,int b){
		int perimeter = (a+b)*2;
		return perimeter;
	}
	
	//���㳤��������ķ���
	public static int area(int a, int b){
		int area = a * b;
		return area;
	}
	
	//����Բ���ܳ��ķ���
	public static double perimeter(int r){
		double perimeter = 3.14 * r *2;
		return perimeter;
	}
	
	//����Բ������ķ���
	public static double area(int r){
		double area = 3.14 * r * r;
		return area;
	}
}
