package it;

/*
 * 写一个方法，传递一个整数(大于1)，在控制台打印1到该数据的值
 */
public class Test06 {
	public static void main(String[] args) {
		printNumber(5);
	}
	public static void printNumber(int n){
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
