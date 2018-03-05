package day09_2_01;

import java.util.ArrayList;

/*
 * 	
 */
public class TestStudentTool {
	public static void main(String[] args) {

		Student s1 = new Student("����", "23", 89);
		Student s2 = new Student("����", "21", 90);
		Student s3 = new Student("����", "20", 58);
		
		ArrayList<Student> list = new ArrayList<Student>();


		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		listStudents(list);
		
		int maxscore = getMaxScore(list);
		System.out.println("ѧ���ɼ�����߷�:" + maxscore);
		
		Student s = getMaxStudent(list);
		System.out.println("��ȡ�ɼ���ߵ�ѧԱ�ǣ�"+s.getName());
		
		double avg = getAverageScore(list);
		System.out.println("ѧ���ɼ���ƽ��ֵ��:"+avg);
		
		int count = getCount(list);
		System.out.println("�������ѧԱ����"+count);
	}

	// ������ӡѧ����Ϣ
	public static void listStudents(ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getName() + "---" + s.getAge() + "---"
					+ s.getScore());
		}
	}

	// ��ȡѧ���ɼ�����߷�
	public static int getMaxScore(ArrayList<Student> list) {
		int max = list.get(0).getScore();
		for (int i = 1; i < list.size(); i++) {
			Student s = list.get(i);
			if (s.getScore() > max) {
				max = s.getScore();
			}
		}

		return max;
	}

	// ��ȡ�ɼ���ߵ�ѧԱ
	public static Student getMaxStudent(ArrayList<Student> list) {
		int maxindex = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if (s.getScore() > list.get(maxindex).getScore()) {
				maxindex = i;
			}
		}
		return list.get(maxindex);
	}

	// ��ȡѧ���ɼ���ƽ��ֵ
	public static double getAverageScore(ArrayList<Student> list) {

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			sum += s.getScore();
		}
		double avg = sum / list.size();
		return avg;
	}

		// ��ȡ�������ѧԱ����
	public static int getCount(ArrayList<Student> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if (s.getScore() < 60) {
				count++;
			}
		}
		return count;
	}
}
