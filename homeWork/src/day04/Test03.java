package day04;

/*
 * 3. ��ȡ�����е����ֵ
 * 
 * ������1�����ȶ���һ�����飬����ֵ
 * 		2����ȡ�������ֵ
 */
public class Test03 {
	public static void main(String[] args) {
		// 1�����ȶ���һ�����飬����ֵ
		int[] arr = { 12, 23, 45, 24, 46 };

		// 2����ȡ�������ֵ �ȶ������ֵ����
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("���������ֵ�ǣ�" + max);
	}
}
