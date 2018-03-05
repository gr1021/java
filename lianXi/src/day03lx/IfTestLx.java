package day03lx;

import java.util.Scanner;

/*
 * 键盘录入成绩，成绩在90——100之间属于"优秀";80-90属于"好";
 * 70-80属于"良";60-70属于"及格";
 */
public class IfTestLx {
	public static void main(String[] args) {
		// 键盘录入成绩
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 接收数据
		System.out.println("请输入成绩：");
		int score = sc.nextInt();

		if (score >= 90 && score < 100) {
			System.out.println("优秀");
		} else if (score >= 80 && score < 90) {
			System.out.println("好");
		} else if (score >= 70 && score < 80) {
			System.out.println("良");
		} else if (score >= 60 && score < 70) {
			System.out.println("及格");
		} else if (score >= 0 && score < 60) {
			System.out.println("不及格");
		}else{
			System.out.println("你输入的成绩有误");
		}
	}
}
