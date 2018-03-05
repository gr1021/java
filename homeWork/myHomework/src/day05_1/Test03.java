package day05_1;

/*
 * 分析一下需求：
 * 1、定义一个方法equals(int[] arr1,int[] arr2)
 * 		功能：比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)
 * 2、定义一个方法fill(int[] arr, int value),
 * 		功能：将数组arr中所有的元素的值改为value
 * 3、定义一个方法fill(int[] arr,int[] fromIndex,int toIndex,int value)
 * 		功能:将数组arr中的元素从索引fromInde开始到toIndex(不包含toIndex)对应的值改为value
 * 4、定义一个方法copyOf(int[] arr,int newLength),
 * 		功能：将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引0开始
 * 5、定义一个方法copyOfRange(int[] arr, int from, int to),
 * 		功能：将数组arr中从索引from(包含from)开始到to结束(不包含to)的元素赋值到新数组中，
 *           并将新数组返回
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		// 定义两个数组
		int[] arr1 = { 10, 29, 23, 24, 35 };
		int[] arr2 = arr1;

		// 调用equals方法
		boolean flag = equals(arr1, arr2);
		System.out.println("flag:" + flag);
		System.out.println("------------------------");
		
		//调用fill方法
		int[] arr = new int[4];
		fill(arr,3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		//调用fill   方法
		int[] fromIndex = new int[3];
	}

	// 定义一个方法equals(int[] arr1,int[] arr2)
	public static boolean equals(int[] arr1, int[] arr2) {

		if ((arr1.length == arr2.length) && (arr1 == arr2)) {
			return true;
		} else {
			return false;
		}	
	}
	
	//定义一个方法fill(int[] arr, int value)
	public static void fill(int[] arr, int value){
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			
		}
	}
}
