package it;
/*
 * �������и������� int[] arr= {10,20,30,40,50,60};����һ���������Խ���������������� 
���������������Ԫ�ص���Сֵ 
 */
public class day05_04 {
	public static void main(String[] args) {
		//��������
		int[] arr = {10,20,30,40,50,60};
		
		//���÷���
		 getMin(arr);
		
	}
	public static void getMin(int[] arr){
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min:"+min);
	}
}
