package day03lx;

/*
 * ��ӡˮ�ɻ�������ͳ��ˮ�ɻ����ĸ���,ˮ�ɻ�����ָһ����λ������ÿ��λ�ϵ����ֵ������͵����䱾��
 * ���Ƚ��л�ȡ��λ��ʮλ����λ�ϵ�����
 */
public class ForLx03 {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 100; i < 1000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
				count++;
				System.out.println("i:" + i);
			}
		}
		System.out.println("count:"+ count);
	}
}
