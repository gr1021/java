package day05;

/*
 * ����һ���������ܽ���һ������(�����������1��
 * ��ӡ0�����������������֮������е�ż��
 * 
 * ���磺���յ�������6  ������귽����ӡ������ż������0 2 4 6
 *       �����5��������귽����ӡ������ż������0 2 4
 */
public class Test01 {
	public static void main(String[] args) {
		
		//���÷���
		printNumber(15);
	}
	public static void printNumber(int n){
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i +" ");
			}
		}
	}
}
