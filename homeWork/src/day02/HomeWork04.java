package day02;
import java.util.Scanner;
/*
 * 4. ����һ���������,�жϸ����Ƿ�Ϊ����,���������,�ڿ���̨�����,�������ƽ��(ʹ����Ԫ��������)
 *	   ����: �ܱ�4���������ܱ�100�������߿��Ա�400����
 */
public class HomeWork04 {
	public static void main(String[] args) {
		//��������¼��Ķ���
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("������������ݣ�");
		int i = sc.nextInt();
		
		/*boolean year = ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) ?  true : false;  
		
		if (year == true ) {
			System.out.println("����");
		}else{
			System.out.println("ƽ��");
		}*/
		
	
		/*char year = ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) ? '��' :'ƽ';
		System.out.println(year);*/
		
		System.out.println(((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) ? "����" : "ƽ��");
	}
}
