package day06;

/*
 * ����һ������,ʵ��ͬʱ������������ļӡ������ˡ����Ľ��,��ͬʱ������ĸ����
 *����(���ĸ������뵽һ�������в�����) 
 */
public class Test05 {
	public static void main(String[] args) {
		
		//��������
		result(3,4);
		
	}
	public static void result(int a, int b){
		int[] arr = new int[4];
		
		arr[0] = a + b;
		arr[1] = a - b;
		arr[2] = a * b;
		arr[3] = a / b;
		
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.println(arr[i] + "]");
			}else{
			System.out.print(arr[i]+",");
			}
		}
	}
}
