package Test;

import java.util.Random;

/*
 * 4.按照以下要求，完成操作：
 a. 随机生成8个1-20之间的偶数，存放到合适的数组中；
 PS: 范围包括1和20
 b. 计算出这些随机数的平均值并输出; 

 */
public class Task04 {
	public static void main(String[] args) {
		
		//创建随机数对象
		Random r = new Random();
		//求和变量
		int sum = 0;
		
		//定义一个数组存放随机数
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			int x = r.nextInt(20)+1;
			while(x % 2!=0){
				x = r.nextInt(20)+1;
			}
			arr[i] = x;
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("sum:"+sum);
		
		// b. 计算出这些随机数的平均值并输出; 
		double avg = sum / 8;
		System.out.println("平均值是："+avg);
		
	}
}
