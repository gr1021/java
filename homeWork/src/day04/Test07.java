package day04;

/*
 * 7. ��������int���͵�����,�ѵ�һ����������ֵ�͵ڶ����������Сֵ���л���,
 * Ȼ�������������(�����в������ظ���Ԫ��)
 * ������1����������int���͵�����
 * 		2���ѵ�һ����������ֵ�͵ڶ����������Сֵ���л���
 * 			��ȡ��һ����������ֵ�͵ڶ����������Сֵ
 * 		3��Ȼ�������������(�����в������ظ���Ԫ��)
 */
public class Test07 {
	public static void main(String[] args) {
		// 1����������int���͵�����
		int[] arr = { 12, 23, 34, 11, 25 };
		int[] arr2 = { 13, 14, 26, 35, 56 };

		int a = 0;
		int b = 0;
		// ��ȡ��һ����������ֵ�͵ڶ����������Сֵ
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				a = i;
			}
		}
		int min = arr2[0];
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] < min) {
				min = arr2[i];
				b = i;
			}
		}
		// �ѵ�һ����������ֵ�͵ڶ����������Сֵ���л���
		int temp = max;
		max = min;
		min = temp;

		System.out.println("�������max�ǣ�" + max);
		System.out.println("�������min�ǣ�" + min);

		for (int i = 0; i < arr.length; i++) {
			arr[a] = max;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			arr2[b] = min;
			
			System.out.print(arr2[i]+" ");
		}
	}
}
