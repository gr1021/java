package it_02;
/*
 * �������и������� int[] arr= {10,20,30,40,50,60};�������û���ظ�Ԫ��.����һ��������
�Խ���������������鲢����������������Ԫ��ֵ������ֵ 
 */
public class day05_001 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60};
		
		int index = getIndex(arr);
		System.out.println("index:"+index);
	}
	public static int getIndex(int[] arr){
		
		int max = arr[0];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
}
