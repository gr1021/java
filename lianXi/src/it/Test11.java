package it;

/*
 * ��������������������ͣ�
 * 		��ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 */
public class Test11 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		change(arr);
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] *= 2;
			}
		}

	}
}
