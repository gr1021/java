package day06;

/*
 * 计算出 5 位数的回文数和 7 位数的回文数相差了多少个? 
 *  回文数是一种数字如：98789 倒读也为 98789 正读倒读都一样这种数字就叫回文数
 */
public class Test02 {
	public static void main(String[] args) {
		
		int x = countHuiwen();
		
		int y = countHuiwen1();
		
		int sub = y - x;
		System.out.println("sub:" + sub);
	}

	// 五位数的回文数
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

	// 七位数的回文数 1234321
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
