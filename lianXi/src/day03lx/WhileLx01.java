package day03lx;

/*
 *  统计水仙花数的个数，用while循环实现
 * 首先获取水仙花数
 * 水仙花数是一个三位数，每个位上的数字立方和等于他本身
 */
public class WhileLx01 {
	public static void main(String[] args) {
		
		//定义统计变量
		int count = 0;
		//获取水仙花数
		int i = 100;
		while(i < 1000){
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				count++;
			}
			i++;
		}
		System.out.println("count:"+ count);
	}
}
