package day05;

/*
 * 1. 定义一个方法获取两个数据的最大值,并在main方法中调用
 */
public class Test01 {
	public static void main(String[] args) {
		
		//调用
		int max = getMax(10,20);
		System.out.println("max:"+ max);
	}
	public static int getMax(int a , int b){
		if (a > b) {
			return a;
		}else{
			return b;
		}
	}
}
