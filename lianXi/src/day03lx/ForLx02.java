package day03lx;

/*
 * 求1-100之间的偶数和 
 * 首先要先获取1-100之间的数据，然后再判断是否是偶数，最后相加
 */
public class ForLx02 {
	public static void main(String[] args) {
		// 定义求和变量
		int sum = 0;
		// 获取1-100之间的数据
		for (int i = 1; i <= 100; i++) {
			// 判断是否是偶数
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("sum:" + sum);
	}
}
