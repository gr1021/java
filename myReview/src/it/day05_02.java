package it;

import java.util.Random;

/*
 * ���������������,������ķ�Χ����[1,100],���巽���������������ĺͲ���ӡ��ֵ 
 */
public class day05_02 {
	public static void main(String[] args) {
		
		//���������������,������ķ�Χ����[1,100]
		Random r = new Random();
		int num1 = r.nextInt(100)+1;
		int num2 = r.nextInt(100)+1;
		
		System.out.println(num1+"------"+num2);
		//���÷���
		int sum = getSum(num1,num2);
		System.out.println("sum:"+sum);
	}
	
	//���巽���������������ĺͲ���ӡ��ֵ
	public static int getSum(int a,int b){
		
		return a + b;
	}
}
