package day05_1;

import java.util.Scanner;

/*
 * 1.键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位) 
 * 2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回 
 * 3.在 main 方法中打印该数字是几位数 
 * 4.演示格式如下:
 * (1)演示一: 
 * 			请输入一个整数:1234 
 * 			控制台输出:1234 是 4 位数字
 * 	(2)演示二: 
 * 			请输入一个整数:-34567 
 * 			控制台输出:-34567 是 5 位数字	
 * 
 * 分析：	
 */
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		
		int n = count(num);
		System.out.println("n:" + n);
	}
	public static int count(int num){
		int n = 1;           //至少是一位数
		while(true){
			num /= 10;        //num 每次除以10
			if (num == 0) {
				break;
			}
			n++;
		}
		return n;
	}
}
