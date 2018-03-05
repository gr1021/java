package day06;

/*
 * 定义一个方法，查找指定数字在数组中出现的位置(若出现多次，多次打印) 
 * 如: 数组[1232]要查找的数是 2 则方法内部会打印索引值 1 ,3  
 * 数组[1232] 要查找的数是 5 则方法每部会打印 “数组中没有这个数字” 
 */
public class Test04 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2 };

		// 方法调用
		address(arr, 2);

	}

	public static void address(int[] arr, int value) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				count++;
				System.out.println(i);
			}
		}
		if (count == 0) {
			System.out.println("数组中没有这个数字");
		}
	}
}
