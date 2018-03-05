package day05_1;

/*
 * ����һ������
 * 1������һ������equals(int[] arr1,int[] arr2)
 * 		���ܣ��Ƚ����������Ƿ����(���Ⱥ����ݾ��������Ϊ������������ͬ��)
 * 2������һ������fill(int[] arr, int value),
 * 		���ܣ�������arr�����е�Ԫ�ص�ֵ��Ϊvalue
 * 3������һ������fill(int[] arr,int[] fromIndex,int toIndex,int value)
 * 		����:������arr�е�Ԫ�ش�����fromInde��ʼ��toIndex(������toIndex)��Ӧ��ֵ��Ϊvalue
 * 4������һ������copyOf(int[] arr,int newLength),
 * 		���ܣ�������arr�е�newLength��Ԫ�ؿ������������У����������鷵�أ�������0��ʼ
 * 5������һ������copyOfRange(int[] arr, int from, int to),
 * 		���ܣ�������arr�д�����from(����from)��ʼ��to����(������to)��Ԫ�ظ�ֵ���������У�
 *           ���������鷵��
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		// ������������
		int[] arr1 = { 10, 29, 23, 24, 35 };
		int[] arr2 = arr1;

		// ����equals����
		boolean flag = equals(arr1, arr2);
		System.out.println("flag:" + flag);
		System.out.println("------------------------");
		
		//����fill����
		int[] arr = new int[4];
		fill(arr,3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		//����fill   ����
		int[] fromIndex = new int[3];
	}

	// ����һ������equals(int[] arr1,int[] arr2)
	public static boolean equals(int[] arr1, int[] arr2) {

		if ((arr1.length == arr2.length) && (arr1 == arr2)) {
			return true;
		} else {
			return false;
		}	
	}
	
	//����һ������fill(int[] arr, int value)
	public static void fill(int[] arr, int value){
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			
		}
	}
}
