package day05_1;

/*
 * �������и������� int[] arr = {10,20,30,40,50,60};
 * �������û���ظ�Ԫ�أ�����һ���������Խ���������������鲢������������е����Ԫ��ֵ������ֵ
 */
public class Test01 {
	public static void main(String[] args) {
		//��������
		int[] arr = {10,20,30,40,50,60};
		
		//���÷���
		int index = getMaxIndex(arr);
		System.out.println("���Ԫ��ֵ������ֵ��:" + index);
	}
	public static int getMaxIndex(int[] arr){
		int max = arr[0];
		int x = 0;
		for ( int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				x = i;
			}
		}
		return x;
	}
}
