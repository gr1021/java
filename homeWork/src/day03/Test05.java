package day03;

/*
 * 5. 计算所有的水仙花数之和
 */
public class Test05 {
	public static void main(String[] args) {
		//定义求和变量
		int sum = 0;
		//首先获取水仙花数
		for (int i = 100; i < 1000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				sum += i;
			}
		}
		System.out.println("sum:"+sum);
	}
}
