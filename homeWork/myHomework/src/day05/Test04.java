package day05;

/*
 * 主方法中给定数组 int[] arr ={10,20,30,40,50,60};
 * 定义一个方法可以接受这个给定的数组并返回这个数组中元素的最小值
 * 
 */
public class Test04 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60};
		
		int min = array(arr);
		System.out.println("min:"+min);
	}
	public static int array(int[] arr){
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
