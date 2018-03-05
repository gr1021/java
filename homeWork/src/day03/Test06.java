package day03;

/*
 * 6. 求出1-100之间第三个可以被5整除并且可以被4整数的数.
 */
public class Test06 {
	public static void main(String[] args) {
		//定义统计变量
		int count = 0;
		//首先获取1-100 之间的数据
		
		for (int i = 1; i <= 100; i++) {
			if ((i % 5 == 0) && (i % 4 == 0)) {
				count++;
				if (count == 3) {
					System.out.println("i:"+ i);
				}
			}
		}
	}
}
