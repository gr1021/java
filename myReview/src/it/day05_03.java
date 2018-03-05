package it;
/*
 * 有如下数组 int[] arr={10,20}; 
	定义一个方法求两个数字的和(方法参数为两个 int 类型),使用这个方法求出数组这两个元素
	相加的结果并打印 
 */
public class day05_03 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {10,20};
		
		int sum = getSum(arr[0],arr[1]);
		System.out.println("sum:"+sum);
	}
	//定义一个方法求两个数字的和(方法参数为两个 int 类型),使用这个方法求出数组这两个元素
	public static int getSum(int a, int b){
		return a + b;
	}
}
