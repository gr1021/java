package Test02;

/*
 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 ������ int[] arr = {1,2,3};	
 ��������"[1, 2, 3]"

 */
public class Task02 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };

					/*System.out.print("[");
					for (int i = 0; i < arr.length; i++) {
						if (i == arr.length - 1) {
							System.out.print(arr[i]);
						} else {
							System.out.print(arr[i] + ",");
						}
					}
					System.out.print("]");*/
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				sb.append(arr[i]);
			}else{
				sb.append(arr[i]).append(",");
			}
		}
		sb.append("]");
//		String ss = sb.toString();
		System.out.println(sb);
		
		//���巽��ʵ��
		String s = reverse(arr);
		System.out.println(s);
		
	}
	
	public static String reverse(int[] arr){
		String ss = "";
		ss += "[";
		
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				ss += arr[i];
			}else{
				ss += arr[i];
				ss += ",";
			}
		}
		ss += "]";
		return ss;
	}
}
