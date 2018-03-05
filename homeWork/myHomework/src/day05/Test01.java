package day05;

/*
 * 定义一个方法，能接受一个整数(这个整数大于1）
 * 打印0到这个整数（包含）之间的所有的偶数
 * 
 * 例如：接收的数字是6  则调用完方法打印出来的偶数就是0 2 4 6
 *       如果是5，则调用完方法打印出来的偶数就是0 2 4
 */
public class Test01 {
	public static void main(String[] args) {
		
		//调用方法
		printNumber(15);
	}
	public static void printNumber(int n){
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i +" ");
			}
		}
	}
}
