package day06;

/*
 * ����һ������,��������������ڸ��� int �������г��ֵĴ���,���һ��û�г�����
 *�� 0��
 *��:�������� 3 ��� 3 ������ int[] arr = {3,4,3,5,7,9};�г��ֵĴ��� 
 */
public class Test03 {
	public static void main(String[] args) {
		// ����һ��int���͵�����
		int[] arr = { 3, 4, 3, 5, 7, 9 };

		// ���÷���
		getCount(arr, 2);

	}

	public static int getCount(int[] arr, int value) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				count++;
			}
		}
		System.out.println("count:"+count);
		return 0;
	}
}
