package day03lx;

/*
 * ��Ͱ��� 1-10  ͳ��ˮ�ɻ������İ���
 */
public class DoWhileLx {
	public static void main(String[] args) {
		//��Ͱ��� 1-10
		int sum = 0;
		int i = 1;
		do{
			sum += i;
			i++;
		}while(i <= 10);
		System.out.println(sum);
		
		//ͳ��ˮ�ɻ������İ���
		int count = 0;
		int x = 100;
		do{
			int ge = x % 10 ;
			int shi = x / 10 % 10;
			int bai = x /100 % 10;
			if (ge*ge*ge + shi*shi*shi + bai*bai*bai == x) {
				count++;
			}
			
			x++;
		}while(x < 1000);
		System.out.println("count:"+count);
	}
	
}
