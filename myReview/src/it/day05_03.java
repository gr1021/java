package it;
/*
 * ���������� int[] arr={10,20}; 
	����һ���������������ֵĺ�(��������Ϊ���� int ����),ʹ����������������������Ԫ��
	��ӵĽ������ӡ 
 */
public class day05_03 {
	public static void main(String[] args) {
		//��������
		int[] arr = {10,20};
		
		int sum = getSum(arr[0],arr[1]);
		System.out.println("sum:"+sum);
	}
	//����һ���������������ֵĺ�(��������Ϊ���� int ����),ʹ����������������������Ԫ��
	public static int getSum(int a, int b){
		return a + b;
	}
}
