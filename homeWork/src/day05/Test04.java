package day05;

/*
 * 4. ����һ�����������һ�������е����ֵ�͵ڶ��������е���Сֵ������֮��
 */
public class Test04 {
	public static void main(String[] args) {
		int[] arr = { 12, 23, 34, 11, 24 };
		int[] arr2 = { 15, 26, 12, 10, 24 };

		// ���÷���
		int sum = sum(arr, arr2);
		System.out.println("���ֵ����Сֵ�ĺ���:" + sum);
	}

	public static int sum(int[] arr, int[] arr2) {
		// �������ֵ���� ��ȡ���ֵ
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// ������Сֵ���� ��ȡ��Сֵ
		int min = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] < min) {
				min = arr2[i];
			}
		}
		// �����ֵ����Сֵ�ĺͣ�������
		int sum = max + min;
		return sum;

	}
}
