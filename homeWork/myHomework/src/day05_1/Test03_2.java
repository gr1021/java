package day05_1;

/*
 * 4������һ������copyOf(int[] arr,int newLength),
 * 		���ܣ�������arr�е�newLength��Ԫ�ؿ������������У����������鷵�أ�������0��ʼ
 * 
 * 
 */
public class Test03_2 {
	public static void main(String[] args) {

		// ��������
		int[] arr = { 12, 23, 34, 11, 13 };
		copyOf(arr, 4);

	}

	public static void copyOf(int[] arr, int newLength) {
		int[] arr1 = new int[6];
		for (int i = 0; i < arr.length; i++) {
			if (i >= 0 && i < newLength) {
				arr1[i] = arr[i];
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}
}
