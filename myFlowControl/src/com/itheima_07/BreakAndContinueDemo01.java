package com.itheima_07;

/*
 * break:��������ѭ��
 * continue:��������ѭ��,������һ�ε�ѭ��
 */
public class BreakAndContinueDemo01 {
	public static void main(String[] args) {
		//break ��䣬ֱ�ӽ���ѭ��
		for (int i = 1; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
			System.out.println("-------------------------");
			
		//continue��� ����������ѭ��
			for (int j = 1; j < 10; j++) {
				if (j == 8 ) {
					continue;
				}
				System.out.println(j);
			}
		
	}
}
