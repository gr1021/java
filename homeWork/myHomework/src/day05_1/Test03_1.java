package day05_1;

/*
 * 3������һ������fill(int[] arr,int fromIndex,int toIndex,int value)
 * 		����:������arr�е�Ԫ�ش�����fromInde��ʼ��toIndex(������toIndex)��Ӧ��ֵ��Ϊvalue
 */
public class Test03_1 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = new int[8];

		// ���÷���
		fill(arr, 2, 6, 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void fill(int[] arr, int fromIndex, int toIndex, int value) {

		for (int i = 0; i < arr.length; i++) {
			if (i >= fromIndex && i < toIndex) {
				arr[i] = value;
			}
		}
	}
}
