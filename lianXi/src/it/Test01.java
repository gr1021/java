package it;

public class Test01 {
	public static void main(String[] args) {
		//单独调用    有明确返回值类型的单独调用是没有意义的
		sum(10,20);
		//输出调用
		System.out.println(sum(10,20));//有意义，但不够完善
		
		//赋值调用
		int sum = sum(10,20);
		System.out.println("sum:"+sum);
		
	}
	public static int sum(int a , int b){
		int sum = a + b;
		return sum;
	}
}
