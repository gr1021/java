package day05;

/*
 * 5. ����һ��������ȡ���������е�Ԫ��֮��
 */
public class Test05 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 1, 2, 3, 4, 5 };
		
		//����
		int sum = sum(arr);
		System.out.println("sum:" + sum);
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
