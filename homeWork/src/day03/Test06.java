package day03;

/*
 * 6. ���1-100֮����������Ա�5�������ҿ��Ա�4��������.
 */
public class Test06 {
	public static void main(String[] args) {
		//����ͳ�Ʊ���
		int count = 0;
		//���Ȼ�ȡ1-100 ֮�������
		
		for (int i = 1; i <= 100; i++) {
			if ((i % 5 == 0) && (i % 4 == 0)) {
				count++;
				if (count == 3) {
					System.out.println("i:"+ i);
				}
			}
		}
	}
}
