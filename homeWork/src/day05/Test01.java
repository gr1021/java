package day05;

/*
 * 1. ����һ��������ȡ�������ݵ����ֵ,����main�����е���
 */
public class Test01 {
	public static void main(String[] args) {
		
		//����
		int max = getMax(10,20);
		System.out.println("max:"+ max);
	}
	public static int getMax(int a , int b){
		if (a > b) {
			return a;
		}else{
			return b;
		}
	}
}
