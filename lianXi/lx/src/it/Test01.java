package it;

public class Test01 {
	public static void main(String[] args) {
		//��������    ����ȷ����ֵ���͵ĵ���������û�������
		sum(10,20);
		//�������
		System.out.println(sum(10,20));//�����壬����������
		
		//��ֵ����
		int sum = sum(10,20);
		System.out.println("sum:"+sum);
		
	}
	public static int sum(int a , int b){
		int sum = a + b;
		return sum;
	}
}
