package day09_03;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 一、	需求说明：程序启动后可以接收三个学员信息，然后可以打印所有学员信息，
 *       并找出身高最高的学员，并打印他们的详细信息
 */
public class Test01 {
	public static void main(String[] args) {
		// 在main()方法中，创建一个可以存储Student对象的集合对象
		ArrayList<Student> array = new ArrayList<Student>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("请输入学生的学号：");
			String id = sc.nextLine();
			System.out.println("请输入学生的姓名：");
			String name = sc.nextLine();
			System.out.println("请输入学生的性别：");
			String sex = sc.nextLine();
			System.out.println("请输入学生的年龄：");
			String age = sc.nextLine();
			System.out.println("请输入学生的身高:");
			String high = sc.nextLine();

			Student s = new Student(id, name, sex, age,high);
			array.add(s);
		}
		
		//调用方法
		printAll(array);
		
		System.out.println("-----------------------------------");
		
		findMaxHeight(array);
	}
	//4.	在MainApp中创建方法，可以打印所有学员信息：

	public static void printAll(ArrayList<Student> array){
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId()+"---"+s.getName()+"--"+s.getSex()+"--"+s.getAge()+"--"+s.getHigh());
		}
	}
	
	//5.	在MainApp中创建方法，可以找出身高最高的学员，并打印：
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
