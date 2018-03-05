package day03lx;

/*
 * for 循环语句的格式：
 * 			for(初始化语句; 判断条件语句; 控制条件语句){
 * 				循环体语句;
 * 		}
 */
public class ForLx {
	public static void main(String[] args) {
		// 输出10次Helloworld
		for (int i = 1; i <= 10; i++) {
			System.out.println("HelloWorld");
		}
		System.out.println("------------------------------");
		// 打印1-5的数据
		for (int i = 1; i < 6; i++) {
			System.out.println("i:" + i);
		}
		System.out.println("------------------------------");
		// 打印5-1的数据
		for (int i = 5; i > 0; i--) {
			System.out.println("i:" + i);
		}
		System.out.println("------------------------------");

		// 1-5数据之和
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;
		}
		System.out.println("sum:" + sum);
		System.out.println("------------------------------");
		
		//
	}
}
