package it;

import java.util.ArrayList;

/*            

姓名 成绩 
张三  99 
李四  66 
王五  77  
遍历集合，将 list 集合中，成绩小于 70 的学生删掉。 
将删除后 list 集合中的学生对象放入 list1 集合中，并且在控制台上打印 list1 集
合中学生的分数平均值 
*/
public class StudentDemo {
	
	public static void main(String[] args) {

		// 创建集合对象 创建两个 ArrayList 集合分别为 list 和 list1 
		ArrayList<Student> list = new ArrayList<Student>();
		ArrayList<Student> list1 = new ArrayList<Student>();

		/*
		 * 添加 3 个学生对象到 list 集合中，分别为： 姓名 成绩 张三 99 李四 66 王五 77
		 */
		Student s1 = new Student("张三", 99);
		Student s2 = new Student("李四 ", 66);
		Student s3 = new Student("王五", 77);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getName()+"---"+s.getScore());
		}
		System.out.println("--------------------------------------");
		// 遍历集合，将 list 集合中，成绩小于 70 的学生删掉。
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			
			if (s.getScore() >= 70) {
				list1.add(s);
				count++;
			}  
			
			list.remove(i);
			
			
		}
		System.out.println("-------------------------------------");
		int sum = 0;
		
		for (int i = 0; i <list1.size(); i++) {
			Student s = list1.get(i);
			sum += s.getScore();
		   
		}
		System.out.println("avg:"+ (double)(sum / count));
		// 将删除后 list 集合中的学生对象放入 list1 集合中，并且在控制台上打印 list1 集
		// 合中学生的分数平均值
		
	}
}
