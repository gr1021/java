package Test02;

import java.util.Scanner;

/*
 * ����ģ���¼
  1.�û��������붼��admin
  2.����û�������û��������붼��ȷ, ��ʾ��½�ɹ�
  3.����û��������������,��ʾ�û����м��λ���
  (����: �û��������������, ������2�λ���)

 */
public class Task01 {
	public static void main(String[] args) {
		
		//1.�û��������붼��admin
		String username = "admin";
		String password = "admin";
		
		Scanner sc  =new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
		System.out.println("�������û�����");
		String name = sc.nextLine();
		System.out.println("���������룺");
		String psw = sc.nextLine();
		
		if (name.equals(username) && psw.equals(password)) {
			System.out.println("��¼�ɹ�");
			break;
		}else{
			if (2-i == 0) {
				System.out.println("����û����������ѱ��������������Ա��ϵ");
			}else{
				System.out.println("��¼ʧ�ܣ��㻹��"+(2-i)+"�λ���");
			}
		}
		}
	}
}
