package it;

/*
 * �ѱ�������Ľ�Ϊ����ʵ�֣������÷���
 * ��Ҫ����Ľ����������ӵģ�[11, 22, 33, 44, 55]
 */
public class Test12 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.print(arr[i] +" ");
		 * } System.out.println();
		 */
		//��������
		printArray(arr);
	}

	// �÷���ʵ��
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}
}
