package day05;

/*
 * 3. ����һ��������ȡһ�������е����ֵ
 */
public class Test03 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 12, 34, 23, 21, 43, 11 };
		
		int max = getMax(arr);
		System.out.println("max:" + max);
	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
