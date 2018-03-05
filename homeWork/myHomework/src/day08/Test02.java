package day08;

/*
 * 一、需求说明：定义如下字符串： 
 * String str = “javajfiewjavajfiowfjavagkljjava”; 
 * 二、请分别定义方法统计出： 
 * 1. 字符串中：字符 j 的数量 
 * 2. 字符串中：字符串 java 的数量
 */
public class Test02 {
	public static void main(String[] args) {

		String str = "javajfiewjavajfiowfjavagkljjava";

		int a = countChar(str, 'j');
		System.out.println("j的数量是：" + a);

		
		 int b = countString(str,"java"); 
		 System.out.println("java的数量是："+ b);
		 
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
