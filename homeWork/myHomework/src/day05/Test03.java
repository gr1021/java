package day05;

/*
 * 有如下数组 int[] arr = {10,20};
 * 定义一个方法求两个数字的和（方法参数为两个int类型),
 * 使用这个方法求出数组这两个元素相加的结果并打印
 */
public class Test03 {
	public static void main(String[] args) {
		int[] arr = {10,20};
		int sum = sum(arr[0],arr[1]);
		System.out.println("sum:"+sum);
		
	}
	public static int sum(int a, int b){
		int c = a + b;
		return c;
	}
}
