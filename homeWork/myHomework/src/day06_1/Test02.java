package day06_1;

/*
 * 定义一个方法传入一个 int 类型数组，输出这个数组中每一个数字及其出现的个数 
 * 	例如 传入数组[1,2,2,2,3,3,4,4,4,4]  打印结果： 
 * 		数字 1 出现了 1 次 
 * 		数字 2 出现了 3 次… 
 */
public class Test02 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 2, 3, 3, 4, 4, 4, 4 };
		
		int[] ele = new int[arr.length];//记录出现的元素
		ele[0] = arr[0]; //数字1
		int index = 1; //已存到ele数组中元素数量
		
		int[] count = new int[arr.length];//记录元素出现的个数
		count[0] = 1; //记录出现1次
		
		for (int i = 1; i < arr.length; i++) {
			int element = arr[i];
			//查找element元素在ele数组中是否存在
			//存在，则元素出现个数+1， 
			boolean isFind = false; 
			for (int j = 0; j < index; j++) {
				if (ele[j] == element) {
					isFind = true;//说明已找到
					count[j]++;//出现次数+1
				}
			}
			if (!isFind) {//如果不存在，则元素存个ele数组中，并设置元素出现个数为1
				ele[index] = element;
				count[index] = 1;
				index++;
			}
		}
		
		//打印结果：
		for (int i = 0; i < index; i++) {
			//数字1出现了1次
			System.out.println("数字"+ele[i]+"出现了"+count[i]+"次");
		}
	} 
	}

