package day04;

/*
 * 5. ����һά���������ֵ����Сֵ������֮��
 * ������1������һ��һά����
 * 		2������������ֵ����Сֵ
 * 		3�������ֵ����Сֵ���
 */
public class Test05 {
	public static void main(String[] args) {
		// ����һ��һά����
		int[] arr = { 12, 34, 25, 11, 45 };

		// ����������ֵ����Сֵ
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int sum = max + min;
		System.out.println("���ֵ����Сֵ��ӵĺ��ǣ�" + sum);
	}
}
