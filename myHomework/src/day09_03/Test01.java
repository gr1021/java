package day09_03;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * һ��	����˵����������������Խ�������ѧԱ��Ϣ��Ȼ����Դ�ӡ����ѧԱ��Ϣ��
 *       ���ҳ������ߵ�ѧԱ������ӡ���ǵ���ϸ��Ϣ
 */
public class Test01 {
	public static void main(String[] args) {
		// ��main()�����У�����һ�����Դ洢Student����ļ��϶���
		ArrayList<Student> array = new ArrayList<Student>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("������ѧ����ѧ�ţ�");
			String id = sc.nextLine();
			System.out.println("������ѧ����������");
			String name = sc.nextLine();
			System.out.println("������ѧ�����Ա�");
			String sex = sc.nextLine();
			System.out.println("������ѧ�������䣺");
			String age = sc.nextLine();
			System.out.println("������ѧ�������:");
			String high = sc.nextLine();

			Student s = new Student(id, name, sex, age,high);
			array.add(s);
		}
		
		//���÷���
		printAll(array);
		
		System.out.println("-----------------------------------");
		
		findMaxHeight(array);
	}
	//4.	��MainApp�д������������Դ�ӡ����ѧԱ��Ϣ��

	public static void printAll(ArrayList<Student> array){
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId()+"---"+s.getName()+"--"+s.getSex()+"--"+s.getAge()+"--"+s.getHigh());
		}
	}
	
	//5.	��MainApp�д��������������ҳ������ߵ�ѧԱ������ӡ��
	public static void findMaxHeight(ArrayList<Student> array){
		
		Double doub;
		double max = 0;
		int index = 0;
		for (int i = 0; i < array.size(); i++) {
			Student stu = array.get(i);
			doub = new Double(stu.getHigh());
			if (max < doub) {
				max = doub;
				index = i;
			}
		}
			Student stu2 = array.get(index);
			System.out.println(stu2.getId() +"---"+ stu2.getName() +"---"+ stu2.getSex()
					+"---"+stu2.getAge() +"---"+stu2.getHigh());
	}

}
