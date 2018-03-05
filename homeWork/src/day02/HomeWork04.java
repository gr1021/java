package day02;
import java.util.Scanner;
/*
 * 4. 输入一个年份数据,判断该年是否为闰年,如果是润年,在控制台输出润,否则输出平年(使用三元运算符完成)
 *	   规则: 能被4整除而不能被100整除或者可以被400整除
 */
public class HomeWork04 {
	public static void main(String[] args) {
		//创建键盘录入的对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入年份数据：");
		int i = sc.nextInt();
		
		/*boolean year = ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) ?  true : false;  
		
		if (year == true ) {
			System.out.println("润年");
		}else{
			System.out.println("平年");
		}*/
		
	
		/*char year = ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) ? '润' :'平';
		System.out.println(year);*/
		
		System.out.println(((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) ? "闰年" : "平年");
	}
}
