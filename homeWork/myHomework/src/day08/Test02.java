package day08;

/*
 * һ������˵�������������ַ����� 
 * String str = ��javajfiewjavajfiowfjavagkljjava��; 
 * ������ֱ��巽��ͳ�Ƴ��� 
 * 1. �ַ����У��ַ� j ������ 
 * 2. �ַ����У��ַ��� java ������
 */
public class Test02 {
	public static void main(String[] args) {

		String str = "javajfiewjavajfiowfjavagkljjava";

		int a = countChar(str, 'j');
		System.out.println("j�������ǣ�" + a);

		
		 int b = countString(str,"java"); 
		 System.out.println("java�������ǣ�"+ b);
		 
	}

	public static int countChar(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == c) {
				count++;
			}
		}
		return count;
	}

	public static int countString(String str, String s) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'j' && str.charAt(i + 1) == 'a'
					&& str.charAt(i + 2) == 'v' && str.charAt(i + 3) == 'a') {
				count++;
			}
		}

		return count;

	}
}
