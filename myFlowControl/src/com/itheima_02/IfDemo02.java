package com.itheima_02;

/*
 * if语句 的第二种格式：
 * 	if(关系表达式){
 * 		语句体1;
 * }else{
 * 		语句体2;
 * }
 */
public class IfDemo02 {
	public static void main(String[] args) {

		System.out.println("开始");

		int a = 10;
		a = 101;

		if (a % 2 == 0) {
			System.out.println("a是偶数");
		} else {
			System.out.println("a是奇数");
		}

		System.out.println("结束");
	}
}
