package day03lx;

/*
 *  ͳ��ˮ�ɻ����ĸ�������whileѭ��ʵ��
 * ���Ȼ�ȡˮ�ɻ���
 * ˮ�ɻ�����һ����λ����ÿ��λ�ϵ����������͵���������
 */
public class WhileLx01 {
	public static void main(String[] args) {
		
		//����ͳ�Ʊ���
		int count = 0;
		//��ȡˮ�ɻ���
		int i = 100;
		while(i < 1000){
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				count++;
			}
			i++;
		}
		System.out.println("count:"+ count);
	}
}
