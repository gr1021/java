package day02;

import java.util.Scanner;

/*
 * 3. 键盘录入一个数据,判断这个数据是否是偶数,如果是偶数就在控制台输出"男
 *    ", 如果不是偶数在控制台输出"女" ; (使用三元运算符完成)
 *    首先进行导包，再创建键盘录入对象，然后接收数据
 */
public class HomeWork03 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入数据：");
		int a = sc.nextInt();

		/*boolean x = (a % 2 == 0) ? true : false;
		if (x == true) {
			System.out.println("男");
		} else {
			System.out.println("女");
		}*/
		
		System.out.println(a % 2 == 0? "男" : "女");
	}
}
