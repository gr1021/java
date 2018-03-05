package Test02;

import java.util.Scanner;

/*
 *   需求: 键盘录入一个字符串, 判断该字符串是否是对称的, 在控制台中输出结果
 例如: 录入字符串 “level”, 输出结果为: “level是对称的”
 录入字符串 “good”, 输出结果为: “good是不对称的”

 */
public class Task03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sc.nextLine();
				
								/*
								 * StringBuilder sb = new StringBuilder(str);
								 *  sb.reverse();
								 *  String s =sb.toString();
								 *  if (ss.length()== 1) {
										System.out.println("字符串长度为1 ，不存在对称"); 
									}else if (s.equals(str)) { 
								 *  System.out.println(str+"是对称的");
								 * }else{ 
								 * System.out.println(str+"是不对称的"); 
								 * }
								 */

		// 定义方法实现
		aaa(str);
								/*boolean flag = bbb(str);
								System.out.println(flag);*/
	}

	public static void aaa(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String ss = sb.toString();
		if (ss.length()== 1) {
			System.out.println("字符串长度为1 ，不存在对称");
		}else if (ss.equals(s)) {
			System.out.println(s + "是对称的");
		} else {
			System.out.println(s + "是不对称的");
		}
	}

								/*public static boolean bbb(String s) {
							
									StringBuilder sb = new StringBuilder(s);
									sb.reverse();
									String ss = sb.toString();
									if (ss.length()== 1) {
											System.out.println("字符串长度为1 ，不存在对称");
									}else if (ss.equals(s)) {
										return true;
									} else {
										return false;
									}
								}*/
}
