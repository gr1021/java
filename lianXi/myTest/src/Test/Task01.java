package Test;

import java.util.Scanner;

/*
 * 1. ��ֱ�����󳤷���������ܳ��ķ�����ͨ���������εķ�ʽ��
 * �������εĳ��Ϳ��룬���㳤���ε�������ܳ�(8��)
 */
public class Task01 {
		public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("�����볤���εĳ���");
			int a = sc.nextInt();
			System.out.println("�����볤���εĿ�");
			int b = sc.nextInt();
			
			int zhouchang = zhouChang(a,b);
			System.out.println("�����ε��ܳ��ǣ�"+ zhouchang);
			
			int area = area(a,b);
			System.out.println("�����ε�����ǣ�"+area);
			
		}
		public static int  zhouChang(int a , int b){
			return (a +b)*2;
		}
		public static int area(int a ,int b){
			return a*b;
		}
}
