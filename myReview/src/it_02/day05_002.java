package it_02;

import java.util.Scanner;

/*
 * ����¼�볤���εĳ��Ϳ�
 * ���巽������ó����ε��ܳ�,���� main �����д�ӡ�ܳ� 
 * ����¼�볤���εĳ��Ϳ� 
 * ���巽������ó����ε����,���� main �����д�ӡ��� 
 * ����¼��Բ�İ뾶 
 * ���巽�������Բ���ܳ�,���� main �����д�ӡ�ܳ� 
 * ����¼��Բ�İ뾶 
 * ���巽�������Բ�����,���� main �����д�ӡ��� 
 */
public class day05_002 {
	public static void main(String[] args) {
		
		//����¼�볤���εĳ��Ϳ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�����볤���εĳ���");
		int a = sc.nextInt();
		System.out.println("�����볤���εĿ�");
		int b = sc.nextInt();
		System.out.println("������Բ�İ뾶��");
		int r = sc.nextInt();
		
		//�����ε��ܳ�
		int zc = zc(a,b);
		System.out.println("�����ε��ܳ��ǣ�"+zc);
		
		//�����ε����
		int area = area(a,b);
		System.out.println("�����ε�����ǣ�"+area);
		
		//Բ���ܳ�
		double zhc = zc(r);
		System.out.println("Բ���ܳ��ǣ�"+ zhc);
		//Բ�����
		double area1 = area(r);
		System.out.println("Բ�������:"+area1);
	}
	
	//���巽������ó����ε��ܳ�,���� main �����д�ӡ�ܳ� 
	public static int zc(int a ,int b){
		return (a+b)*2;
	}
	//���巽������ó����ε����,���� main �����д�ӡ��� 
	public static int area(int a , int b){
		return a*b;
	}
	
	//���巽�������Բ���ܳ�,���� main �����д�ӡ�ܳ� 
	public static double zc(int r){
		return 3.14*r*2;
	}
	
	//���巽�������Բ�����,���� main �����д�ӡ��� 
	public static double area(int r){
		return 3.14*r*r;
	}
}
