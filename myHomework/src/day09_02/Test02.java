package day09_02;

import java.util.ArrayList;

/*







 */
public class Test02 {
	public static void main(String[] args) {
		// ��main()�����У�����һ�����Դ洢Student����ļ��϶���
		ArrayList<Student> array = new ArrayList<Student>();

		// ����ѧ������
		Student s1 = new Student("it001", "�Ʋ�", 1.72);
		Student s2 = new Student("it002", "�����", 1.78);
		Student s3 = new Student("it003", "������", 1.64);
		Student s4 = new Student("it004", "��ӱ", 1.68);

		// �����漸��������ӵ�������
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);

		// �������ϴ�ӡÿ�����������ֵ
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println("ѧ��:" + s.getId() + " ������" + s.getName()
					+ " ��ߣ�" + s.getHigh());
		}
		// ��ȡ����ӡ���ϴ�С
		int length = array.size();
		System.out.println("length��" + length);

		// ��ȡ��3��ѧԱ���󣬲���ӡ������ֵ
		/*
		 * Student s = array.get(2);
		 * System.out.println("ѧ��:"+s.getId()+" ������"+s.
		 * getName()+" ��ߣ�"+s.getHigh());
		 */

		// �Ƴ�����4��ѧԱ���� �ٴλ�ȡ����ӡ���ϴ�С��
		// array.remove(3);
		// System.out.println("length:"+array.size());

		// ����һ�������滻Ϊ���¶���
		// it005 ������ 1.67
		s1.setId("it005");
		s1.setName("������");
		s1.setHigh(1.67);
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println("ѧ��:" + s.getId() + " ������" + s.getName()
					+ " ��ߣ�" + s.getHigh());
		}

		System.out.println("-----------------------------------");
		// �������ϣ���ӡ�������1.70���ϵ�ѧԱ��Ϣ��

		for (int i = 0; i < array.size(); i++) {
			Student ss = array.get(i);
			if (ss.getHigh() > 1.70) {
				System.out.println("ѧ��:" + ss.getId() + " ������" + ss.getName()
						+ " ��ߣ�" + ss.getHigh());
			}
		}
		System.out.println("---------------------------------------");
		// �������ϣ���ӡ������յ�ѧԱ��Ϣ��
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getName().startsWith("��")) {
				System.out.println("ѧ��:" + s.getId() + " ������" + s.getName()
						+ " ��ߣ�" + s.getHigh());
			}
		}

	}
}
