package day05;

/*
 * 6. ����һ����������һ�����������е�ż��Ԫ��֮��
 */
public class Test06 {
	public static void main(String[] args) {
		// ���ȶ���һ������
		int[] arr = { 1, 2, 4, 3, 5 };

		int sum = sum(arr);
		System.out.println("sum:" + sum);
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
}
