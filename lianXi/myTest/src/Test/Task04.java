package Test;

import java.util.Random;

/*
 * 4.��������Ҫ����ɲ�����
 a. �������8��1-20֮���ż������ŵ����ʵ������У�
 PS: ��Χ����1��20
 b. �������Щ�������ƽ��ֵ�����; 

 */
public class Task04 {
	public static void main(String[] args) {
		
		//�������������
		Random r = new Random();
		//��ͱ���
		int sum = 0;
		
		//����һ�������������
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			int x = r.nextInt(20)+1;
			while(x % 2!=0){
				x = r.nextInt(20)+1;
			}
			arr[i] = x;
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("sum:"+sum);
		
		// b. �������Щ�������ƽ��ֵ�����; 
		double avg = sum / 8;
		System.out.println("ƽ��ֵ�ǣ�"+avg);
		
	}
}
