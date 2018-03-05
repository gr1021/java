package com.itheima_02;

/*
 * if语句的第三种格式：
 *if(关系表达式1){
 *	语句体1;
 *}else  if(关系表达式2){
 *	语句体2;
 *}
 *…….
 *else{
 *	语句体n+1;
 *}
 */
public class IfDemo03 {
	public static void main(String[] args) {
		System.out.println("开始");

		int x = 5;
		int y;

		if (x > 3) {
			y = 2 * x + 1;

		} else if (x >= -1 && x < 3) {
			y = 2 * x;
		} else if (x < -1) {
			y = 2 * x - 1;
		} else {
			y = 0;
		}

		System.out.println("y:" + y);
		System.out.println("结束");
	}
}
