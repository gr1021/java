package day05;

/*
 * ���������� int[] arr = {10,20};
 * ����һ���������������ֵĺͣ���������Ϊ����int����),
 * ʹ����������������������Ԫ����ӵĽ������ӡ
 */
public class Test03 {
	public static void main(String[] args) {
		int[] arr = {10,20};
		int sum = sum(arr[0],arr[1]);
		System.out.println("sum:"+sum);
		
	}
	public static int sum(int a, int b){
		int c = a + b;
		return c;
	}
}
