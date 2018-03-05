package day03;

import java.util.Scanner;

/*
 * 1. 根据对应的分数输出对应的等级: 
 *	100 - 90 :  A
 *	80  - 89 :  B
 *	70  - 79 :  C
 *	60  - 69 :  D
 *	0   - 59 :  E
 */
public class Test01 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入分数：");
		int score = sc.nextInt();

		if (score >= 90 && score < 100) {
			System.out.println("A");
		} else if (score >= 80 && score < 90) {
			System.out.println("B");
		} else if (score >= 70 && score < 80) {
			System.out.println("C");
		} else if (score >= 60 && score < 70) {
			System.out.println("D");
		} else if (score >= 0 && score < 60) {
			System.out.println("E");
		} else {
			System.out.println("你输入的分数有误");
		}
	}
}
