package it;

/*
 * �ѻ�ȡ������ֵ�Ľ�Ϊ����ʵ�֣������÷���
 */
public class Test13 {
	public static void main(String[] args) {
		int[] arr = { 12, 23, 43, 11, 32 };
		int max = getMax(arr);
		System.out.println(max);
	}
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
