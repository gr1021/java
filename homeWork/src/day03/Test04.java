package day03;

/*
 * 4. 计算1-100之间的奇数之和
 */
public class Test04 {
	public static void main(String[] args) {
		// 定义求和变量
		int sum = 0;
		// 首先获取1-100之间的数据
		for (int i = 1; i <= 100; i++) {
			// 判断是否是奇数
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("sum:" + sum);
	}
}
