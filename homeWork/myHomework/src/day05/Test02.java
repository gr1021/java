package day05;

import java.util.Random;

/*
 * �����������������������ķ�Χ����[1,100] ,
 * ���巽���������������ĺͲ���ӡ��ֵ
 */
public class Test02 {
	public static void main(String[] args) {
		// ��ȡ�����
		Random r = new Random();
		int a = r.nextInt(100) + 1;
		int b = r.nextInt(100) + 1;

		System.out.println("a:" + a);
		System.out.println("b:" + b);

		int sum = sum(a, b);
		System.out.println("sum:" + sum);
	}

	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}
}
