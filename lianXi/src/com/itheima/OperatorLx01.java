package com.itheima;
/*
 * 算数运算符：+，-，*，/， %，++，--
 */
public class OperatorLx01 {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println("-----------------------------");
		//扩充：与字符和字符串进行加法运算
		// 与字符相加
		int y = 'a';//'a' :97
		System.out.println(a + y);
		System.out.println("----------------------------");
		
		//与字符串相加，其实是与字符串进行拼接
		String aa = "Hello";
		System.out.println(aa + a + b);
		System.out.println(a + b + aa );
		System.out.println("----------------------------");
		
		
		//注意 / 和  % 的区别，%是两个数据相除时的余数，/是两个数据相除时的商
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println("------------------------------");
		//++:自增运算，放在变量前面，先自增后运算；放在变量后面，先运算，后自增
		/*int c = a++;
		System.out.println(c);
		int x = ++b;
		System.out.println(b);
		System.out.println("------------------------------");*/
		//--:自减运算，放在变量前面，先自减后运算；放在变量后面，先运算，后自减
		int c = a--;
		System.out.println(c);
		int x = --a;
		System.out.println(x);
	}
}
