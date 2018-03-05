package day03lx;

/*
 * 打印水仙花数，并统计水仙花数的个数,水仙花数是指一个三位数，其每个位上的数字的立方和等于其本身
 * 首先进行获取个位，十位，百位上的数字
 */
public class ForLx03 {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 100; i < 1000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
				count++;
				System.out.println("i:" + i);
			}
		}
		System.out.println("count:"+ count);
	}
}
