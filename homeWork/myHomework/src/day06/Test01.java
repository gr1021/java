package day06;

import java.util.Random;

/*
 * 随机产生 5 个范围是[1,100]的整数,把这些数字中所有个位或十位为 3 的数字打印出来 
 */
public class Test01 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		//获取随机数
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			int x = r.nextInt(100) + 1;
			arr[i] = x;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("------------------------");
		
		//方法调用
		printNum(arr);
		
	}
	public static void printNum(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 10 == 3) || (arr[i] / 10 % 10 == 3)) {
				System.out.println(arr[i]);
			}
		}
	}
}
