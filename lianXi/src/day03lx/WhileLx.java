package day03lx;

/*
 * ��whileѭ��ʵ�ִ�ӡ1-100֮��ĺ�
 */
public class WhileLx {
	public static void main(String[] args) {
		
		//������ͱ���
		int sum = 0;
		/*//������forѭ��д����
		for (int i = 1; i <= 100; i++) {
			sum += i ;
		}
		System.out.println(sum);
		System.out.println("---------------------");*/
		
		//while ѭ����ʵ��
		
		int i = 1;//��ʼ��ֵ
		while(i <= 100){//�ж��������
			sum += i ;//ѭ�������
			i++;//�����������
		}
		System.out.println(sum);
	}
}
