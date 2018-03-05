package day03lx;

/*
 * 用while循环实现打印1-100之间的和
 */
public class WhileLx {
	public static void main(String[] args) {
		
		//定义求和变量
		int sum = 0;
		/*//首先用for循环写出来
		for (int i = 1; i <= 100; i++) {
			sum += i ;
		}
		System.out.println(sum);
		System.out.println("---------------------");*/
		
		//while 循环来实现
		
		int i = 1;//初始化值
		while(i <= 100){//判断条件语句
			sum += i ;//循环体语句
			i++;//控制条件语句
		}
		System.out.println(sum);
	}
}
