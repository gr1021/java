package day05;

/*
 * �������и������� int[] arr ={10,20,30,40,50,60};
 * ����һ���������Խ���������������鲢�������������Ԫ�ص���Сֵ
 * 
 */
public class Test04 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60};
		
		int min = array(arr);
		System.out.println("min:"+min);
	}
	public static int array(int[] arr){
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
