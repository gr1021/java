package it_02;

/*
 * 1.定义一个方法 equals(int[] arr1,int[] arr2),功能:比较两个数组是否相等(长度和内容
 均相等则认为两个数组是相同的) 
 2.定义一个方法 fill(int[] arr,int value),功能:将数组 arr 中的所有元素的值改为 value 
 
 3.定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value),功能:将数组arr中的元
素从索引 fromIndex 开始到 toIndex(不包含 toIndex)对应的值改为 value 
 */
public class day05_003 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4};
		
		boolean flag = equals(arr1,arr2);
		System.out.println("flag:"+flag);
		
		fill(arr, 3);
		
		System.out.println();
		fill(arr,1,3,8);
		
		System.out.println();
		copyOf(arr,3);
		
		System.out.println();
		copyOfRange(arr,1,3);
		
	}
	
	//定义一个方法 equals(int[] arr1,int[] arr2)
	public static boolean equals(int[] arr1, int[] arr2){
		
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i] == arr2[i]) {
					return true;
				}else {
					return false;
				}
			}
		} 
			return false;
	}
	
	//定义一个方法 fill(int[] arr,int value)  功能:将数组 arr 中的所有元素的值改为 value 
	public static void fill(int[] arr , int value){
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			System.out.print(arr[i]+" ");
		}
	}
	
	//fill(int[] arr,int fromIndex,int toIndex,int value)
	//将数组arr中的元素从索引 fromIndex 开始到 toIndex(不包含 toIndex)对应的值改为 value 
	public static void fill(int[] arr,int fromIndex,int toIndex,int value){
		for (int i = 0; i < arr.length; i++) {
			if (i >= fromIndex && i < toIndex) {
				arr[i] = value;
			}
			System.out.print(arr[i]+" ");
		}
	}

	//4.定义一个方法copyOf(int[] arr, int newLength),功能:将数组arr中的newLength个元
	//素拷贝到新数组中,并将新数组返回,从索引为 0 开始 
	public static void copyOf(int[] arr, int newLength){
		int[] arr3 = new int[4];
		
		for (int i = 0; i < newLength; i++) {
			arr3[i] = arr[i];
			System.out.print(arr3[i]+" ");
		}
	}

	//5.定义一个方法 copyOfRange(int[] arr,int from, int to),功能:将数组 arr 中从索引
	//from(包含 from)开始到索引 to 结束(不包含 to)的元素复制到新数组中,并将新数组返回 
	public static void copyOfRange(int[] arr,int from, int to){
		
		int[] arr4 = new int[4];
		for (int i = 0; i < arr.length; i++) {
			if (i >= from && i < to) {
				arr4[i] = arr[i];
			}
			System.out.print(arr4[i]+" ");
		}
	}
}
