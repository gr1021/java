package day09_01;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {

		// ����һ��ֻ�ܴ洢�ַ����ļ��϶���
		ArrayList<String> array = new ArrayList<String>();

		// �򼯺�������������ݣ�
		array.add("�����");
		array.add("��˽�");
		array.add("ɳ����");
		array.add("���ȹ���");

		// ���ñ�����ֱ�Ӵ�ӡ����
		System.out.println(array);

		// ��ȡ��4��Ԫ�أ�ע�⣬��--��4��Ԫ�أ����������ǣ���
		System.out.println(array.get(3));

		// ��ӡһ�¼��ϴ�С
		System.out.println(array.size());

		// ɾ��Ԫ�ء����ȹ�����
		// System.out.println("remove:"+array.remove("���ȹ���"));

		// ɾ����3��Ԫ�أ�ע�⣺��--��3��Ԫ�أ�
		System.out.println("remove:" + array.remove(3));

		// ��Ԫ�ء���˽䡱��Ϊ�������ܡ�
		System.out.println(array.set(1, "������"));

		System.out.println(array);

	}
}
