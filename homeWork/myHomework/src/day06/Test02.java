package day06;

/*
 * ����� 5 λ���Ļ������� 7 λ���Ļ���������˶��ٸ�? 
 *  ��������һ�������磺98789 ����ҲΪ 98789 ����������һ���������־ͽл�����
 */
public class Test02 {
	public static void main(String[] args) {
		
		int x = countHuiwen();
		
		int y = countHuiwen1();
		
		int sub = y - x;
		System.out.println("sub:" + sub);
	}

	// ��λ���Ļ�����
	public static int countHuiwen() {
		int count = 0;
		for (int i = 10000; i < 100000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int qian = i / 10 / 10 / 10 % 10;
			int wan = i / 10 / 10 / 10 / 10 % 10;

			if (ge == wan && shi == qian) {
				count++;
			}
		}
		return count;
	}

	// ��λ���Ļ����� 1234321
	public static int countHuiwen1() {
		int count1 = 0;
		for (int i = 1000000; i < 10000000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			int qian = i / 10 / 10 / 10 % 10;
			int wan = i / 10 / 10 / 10 / 10 % 10;
			int shiwan = i / 100000 % 10;
			int baiwan = i / 1000000 % 10;

			if (ge == baiwan && shi == shiwan && bai == wan) {
				count1++;
			}
		}
		return count1;
	}
}
