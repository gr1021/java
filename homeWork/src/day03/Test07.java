package day03;

/*
 * 7.�����������󣬲��ô���ʵ�֣�
 *		1.���������߶�Ϊ8848�ף���һ���㹻���ֽ�����Ϊ0.0001�ס�
 *	    2.���ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�
 * 	��һ���۵���2*x
 * 	�ڶ����۵���4*x
 * 	�������۵���8*x
 * 	���Ĵ��۵���16*x
 * 	������۵���32*x
 * .....
 * 	��n���۵���n*x == 8848,��n  27
 */
public class Test07 {
	public static void main(String[] args) {
		int count = 0;
		//double x = 0.0001;
		//��һ�ַ���
		for (double x = 0.0001; x <= 8848; x *= 2) {
			count++;
		}
		
		//�ڶ��ַ���
		/*while (x <= 8848) {
			x *= 2;
			count++;
		}*/
		
		//�����ַ���
		/*while(true){
			count++;
			x *= 2;
			if (x >= 8848) {
				break;
			}
		}*/
		System.out.println("count:" + count);
	}
}
