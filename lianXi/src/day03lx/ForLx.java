package day03lx;

/*
 * for ѭ�����ĸ�ʽ��
 * 			for(��ʼ�����; �ж��������; �����������){
 * 				ѭ�������;
 * 		}
 */
public class ForLx {
	public static void main(String[] args) {
		// ���10��Helloworld
		for (int i = 1; i <= 10; i++) {
			System.out.println("HelloWorld");
		}
		System.out.println("------------------------------");
		// ��ӡ1-5������
		for (int i = 1; i < 6; i++) {
			System.out.println("i:" + i);
		}
		System.out.println("------------------------------");
		// ��ӡ5-1������
		for (int i = 5; i > 0; i--) {
			System.out.println("i:" + i);
		}
		System.out.println("------------------------------");

		// 1-5����֮��
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;
		}
		System.out.println("sum:" + sum);
		System.out.println("------------------------------");
		
		//
	}
}
