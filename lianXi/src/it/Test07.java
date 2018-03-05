package it;

/*
 *  写一个方法，打印水仙花数
 */
public class Test07 {
	public static void main(String[] args) {
		printFlower();
		
	}

	public static void printFlower() {
		for (int i = 100; i < 1000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				System.out.println(i);
			}
		}
	}

}
