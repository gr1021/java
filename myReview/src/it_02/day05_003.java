package it_02;

/*
 * 1.����һ������ equals(int[] arr1,int[] arr2),����:�Ƚ����������Ƿ����(���Ⱥ�����
 ���������Ϊ������������ͬ��) 
 2.����һ������ fill(int[] arr,int value),����:������ arr �е�����Ԫ�ص�ֵ��Ϊ value 
 
 3.����һ������fill(int[] arr,int fromIndex,int toIndex,int value),����:������arr�е�Ԫ
�ش����� fromIndex ��ʼ�� toIndex(������ toIndex)��Ӧ��ֵ��Ϊ value 
 */
public class day05_003 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4};
		
		boolean flag = equals(arr1,arr2);
		System.out.println("flag:"+flag);
		
		fill(arr, 3);
		
		System.out.println();
		fill(arr,1,3,8);
		
		System.out.println();
		copyOf(arr,3);
		
		System.out.println();
		copyOfRange(arr,1,3);
		
	}
	
	//����һ������ equals(int[] arr1,int[] arr2)
	public static boolean equals(int[] arr1, int[] arr2){
		
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i] == arr2[i]) {
					return true;
				}else {
					return false;
				}
			}
		} 
			return false;
	}
	
	//����һ������ fill(int[] arr,int value)  ����:������ arr �е�����Ԫ�ص�ֵ��Ϊ value 
	public static void fill(int[] arr , int value){
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			System.out.print(arr[i]+" ");
		}
	}
	
	//fill(int[] arr,int fromIndex,int toIndex,int value)
	//������arr�е�Ԫ�ش����� fromIndex ��ʼ�� toIndex(������ toIndex)��Ӧ��ֵ��Ϊ value 
	public static void fill(int[] arr,int fromIndex,int toIndex,int value){
		for (int i = 0; i < arr.length; i++) {
			if (i >= fromIndex && i < toIndex) {
				arr[i] = value;
			}
			System.out.print(arr[i]+" ");
		}
	}

	//4.����һ������copyOf(int[] arr, int newLength),����:������arr�е�newLength��Ԫ
	//�ؿ�������������,���������鷵��,������Ϊ 0 ��ʼ 
	public static void copyOf(int[] arr, int newLength){
		int[] arr3 = new int[4];
		
		for (int i = 0; i < newLength; i++) {
			arr3[i] = arr[i];
			System.out.print(arr3[i]+" ");
		}
	}

	//5.����һ������ copyOfRange(int[] arr,int from, int to),����:������ arr �д�����
	//from(���� from)��ʼ������ to ����(������ to)��Ԫ�ظ��Ƶ���������,���������鷵�� 
	public static void copyOfRange(int[] arr,int from, int to){
		
		int[] arr4 = new int[4];
		for (int i = 0; i < arr.length; i++) {
			if (i >= from && i < to) {
				arr4[i] = arr[i];
			}
			System.out.print(arr4[i]+" ");
		}
	}
}
