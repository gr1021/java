package day05_1;

/*
 * 5������һ������copyOfRange(int[] arr, int from, int to),
 * 		���ܣ�������arr�д�����from(����from)��ʼ��to����(������to)��Ԫ�ظ�ֵ���������У�
 *           ���������鷵��
 */
public class Test03_3 {
	public static void main(String[] args) {
		int[] arr = {12,23,14,25,34};
		
		copyOfRange(arr,2,4);
	}
	public static void copyOfRange(int[] arr, int from , int to){
		int[] arr1 = new int[6];
		for (int i = 0; i < arr.length; i++) {
			if (i >= from && i < to) {
				arr1[i] = arr[i];
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
