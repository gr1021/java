package day06;

/*
 * 
 * ����һ������������ָ�������������г��ֵ�λ��(�����ֶ�Σ���δ�ӡ) 
 * ��: ����[1232]Ҫ���ҵ����� 2 �򷽷��ڲ����ӡ����ֵ 1 ,3  
 * ����[1232] Ҫ���ҵ����� 5 �򷽷�ÿ�����ӡ ��������û��������֡� 
 */
public class Test04_1 {
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 2 };

		// ��������
		address(arr, 2);
	}
	public static void address(int[] arr, int value){
		
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
				System.out.print(i +" ");
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("������û���������");
		}
	}
}
