package day03lx;

/*
 * ��1-100֮���ż���� 
 * ����Ҫ�Ȼ�ȡ1-100֮������ݣ�Ȼ�����ж��Ƿ���ż����������
 */
public class ForLx02 {
	public static void main(String[] args) {
		// ������ͱ���
		int sum = 0;
		// ��ȡ1-100֮�������
		for (int i = 1; i <= 100; i++) {
			// �ж��Ƿ���ż��
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("sum:" + sum);
	}
}
