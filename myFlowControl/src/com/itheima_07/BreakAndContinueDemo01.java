package com.itheima_07;

/*
 * break:结束整个循环
 * continue:结束本次循环,继续下一次的循环
 */
public class BreakAndContinueDemo01 {
	public static void main(String[] args) {
		//break 语句，直接结束循环
		for (int i = 1; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
			System.out.println("-------------------------");
			
		//continue语句 ，结束本次循环
			for (int j = 1; j < 10; j++) {
				if (j == 8 ) {
					continue;
				}
				System.out.println(j);
			}
		
	}
}
