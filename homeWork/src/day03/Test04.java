package day03;

/*
 * 4. ����1-100֮�������֮��
 */
public class Test04 {
	public static void main(String[] args) {
		// ������ͱ���
		int sum = 0;
		// ���Ȼ�ȡ1-100֮�������
		for (int i = 1; i <= 100; i++) {
			// �ж��Ƿ�������
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("sum:" + sum);
	}
}
