package day04;

/*
 * 6. ��һ�������е����ֵ����Сֵ���л���
 * ������1����������
 * 		2������������ֵ����Сֵ
 * 		3���������ֵ����Сֵ
 */
public class Test06 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 12, 34, 54, 21, 32 };

		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int temp = max;
		max = min;
		min = temp;
		System.out.println("����������ֵ��:"+max);
		System.out.println("���������Сֵ��:"+min);
		
		
		
	}
}
