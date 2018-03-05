package day09_02;

import java.util.ArrayList;

/*







 */
public class Test02 {
	public static void main(String[] args) {
		// 在main()方法中，创建一个可以存储Student对象的集合对象
		ArrayList<Student> array = new ArrayList<Student>();

		// 创建学生对象
		Student s1 = new Student("it001", "黄渤", 1.72);
		Student s2 = new Student("it002", "孙红雷", 1.78);
		Student s3 = new Student("it003", "章子怡", 1.64);
		Student s4 = new Student("it004", "杨颖", 1.68);

		// 将上面几个对象添加到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);

		// 遍历集合打印每个对象的属性值
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println("学号:" + s.getId() + " 姓名：" + s.getName()
					+ " 身高：" + s.getHigh());
		}
		// 获取并打印集合大小
		int length = array.size();
		System.out.println("length：" + length);

		// 获取第3个学员对象，并打印其属性值
		/*
		 * Student s = array.get(2);
		 * System.out.println("学号:"+s.getId()+" 姓名："+s.
		 * getName()+" 身高："+s.getHigh());
		 */

		// 移除掉第4个学员对象 再次获取并打印集合大小；
		// array.remove(3);
		// System.out.println("length:"+array.size());

		// 将第一个对象替换为以下对象：
		// it005 撒贝宁 1.67
		s1.setId("it005");
		s1.setName("撒贝宁");
		s1.setHigh(1.67);
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println("学号:" + s.getId() + " 姓名：" + s.getName()
					+ " 身高：" + s.getHigh());
		}

		System.out.println("-----------------------------------");
		// 遍历集合，打印出身高在1.70以上的学员信息；

		for (int i = 0; i < array.size(); i++) {
			Student ss = array.get(i);
			if (ss.getHigh() > 1.70) {
				System.out.println("学号:" + ss.getId() + " 姓名：" + ss.getName()
						+ " 身高：" + ss.getHigh());
			}
		}
		System.out.println("---------------------------------------");
		// 遍历集合，打印出“孙”姓的学员信息；
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getName().startsWith("孙")) {
				System.out.println("学号:" + s.getId() + " 姓名：" + s.getName()
						+ " 身高：" + s.getHigh());
			}
		}

	}
}
