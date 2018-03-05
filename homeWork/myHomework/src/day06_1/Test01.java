package day06_1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1.键盘录入 10 个整数存入数组中 
 * 2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧 
 * 3.定义一个方法打印原数组和处理后的数组 
 * 4.定义一个方法传入一个 int 类型数组，输出这个数组中只出现一次的数字及个数 
 */
public class Test01 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		// 1.键盘录入 10 个整数存入数组中
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个元素");
			arr[i] = sc.nextInt();
			
		}
		printArray(arr);
		array(arr);
		printArray(arr);
		count(arr);
		
	}


	// 2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧 1 2 3 4 5 6
	public static void array(int[] arr) {
		int start=0;
		int end = arr.length-1;
		while(start < end){
			while (arr[end] % 2 == 0 && start < end ) {
				end--;
			}
			while (arr[start] % 2 == 1 && start < end) {
				start++;
			}
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
		}
}


	// 3.定义一个方法打印原数组和处理后的数组
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.println(arr[i]+"]");
			}else{
			System.out.print(arr[i]+",");
			}
		}
	}

	// 4.定义一个方法传入一个 int 类型数组，输出这个数组中只出现一次的数字及个数 
	public static int count(int[] arr,int num) {
		//定义计数器
		int count = 0;
		//遍历数组
		for(int i = 0;i<arr.length;i++) {
			if(num==arr[i]) {//如果数组当前元素和要统计的数字num的值相等
				count++;//计数器+1
			}
		}
		return count;
	
	}
	
	public static void count(int[] arr) {
		int count = 0;
		
		for(int i = 0;i<arr.length;i++) {
			if(count(arr,arr[i])==1) {//如果数组中当前元素在数组中出现的次数等于1
				if(count==0){//说明出现了第一个出现一次的数字，要打印以下提示信息，以后再出现不用打印了
					System.out.print("数组："+Arrays.toString(arr)+"中，只出现一次的数字包括：");	
				}
				System.out.print(arr[i]+" ");//打印该元素
				count++;//计数器+1
			}
		}
		System.out.println();
		System.out.println("数组："+Arrays.toString(arr)+" 中只出现一次的数字的数量为："+count+" 个");
	}
}
