package day06;

/*
 * ����һ������������ָ�������������г��ֵ�λ��(�����ֶ�Σ���δ�ӡ) 
 * ��: ����[1232]Ҫ���ҵ����� 2 �򷽷��ڲ����ӡ����ֵ 1 ,3  
 * ����[1232] Ҫ���ҵ����� 5 �򷽷�ÿ�����ӡ ��������û��������֡� 
 */
public class Test04 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2 };

		// ��������
		address(arr, 2);

	}

	public static void address(int[] arr, int value) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				count++;
				System.out.println(i);
			}
		}
		if (count == 0) {
			System.out.println("������û���������");
		}
	}
}
