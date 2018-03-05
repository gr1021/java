package day09_2_01;

import java.util.ArrayList;

/*
 * 	
 */
public class TestStudentTool {
	public static void main(String[] args) {

		Student s1 = new Student("张三", "23", 89);
		Student s2 = new Student("李四", "21", 90);
		Student s3 = new Student("王五", "20", 58);
		
		ArrayList<Student> list = new ArrayList<Student>();


		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		listStudents(list);
		
		int maxscore = getMaxScore(list);
		System.out.println("学生成绩的最高分:" + maxscore);
		
		Student s = getMaxStudent(list);
		System.out.println("获取成绩最高的学员是："+s.getName());
		
		double avg = getAverageScore(list);
		System.out.println("学生成绩的平均值是:"+avg);
		
		int count = getCount(list);
		System.out.println("不及格的学员数量"+count);
	}

	// 遍历打印学生信息
	public static void listStudents(ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getName() + "---" + s.getAge() + "---"
					+ s.getScore());
		}
	}

	// 获取学生成绩的最高分
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

	// 获取成绩最高的学员
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

	// 获取学生成绩的平均值
	public static double getAverageScore(ArrayList<Student> list) {

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			sum += s.getScore();
		}
		double avg = sum / list.size();
		return avg;
	}

		// 获取不及格的学员数量
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
