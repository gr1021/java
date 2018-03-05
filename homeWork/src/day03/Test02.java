package day03;

import java.util.Scanner;

/*
 * 2. 根据键盘录入的月份输出对应的季节
 */
public class Test02 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入月份：");
		int month = sc.nextInt();

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		default:
			System.out.println("你输入的月份有误");
			break;
		}
	}
}
