package day03;

/*
 * 5. �������е�ˮ�ɻ���֮��
 */
public class Test05 {
	public static void main(String[] args) {
		//������ͱ���
		int sum = 0;
		//���Ȼ�ȡˮ�ɻ���
		for (int i = 100; i < 1000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				sum += i;
			}
		}
		System.out.println("sum:"+sum);
	}
}
