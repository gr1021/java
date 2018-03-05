package day06;

/*
 * 定义一个方法,实现同时求出两个整数的加、减、乘、除的结果,并同时把这个四个结果
 *返回(把四个数放入到一个数组中并返回) 
 */
public class Test05 {
	public static void main(String[] args) {
		
		//方法调用
		result(3,4);
		
	}
	public static void result(int a, int b){
		int[] arr = new int[4];
		
		arr[0] = a + b;
		arr[1] = a - b;
		arr[2] = a * b;
		arr[3] = a / b;
		
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.println(arr[i] + "]");
			}else{
			System.out.print(arr[i]+",");
			}
		}
	}
}
