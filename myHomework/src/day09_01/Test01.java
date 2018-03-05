package day09_01;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {

		// 定义一个只能存储字符串的集合对象
		ArrayList<String> array = new ArrayList<String>();

		// 向集合内添加以下数据：
		array.add("孙悟空");
		array.add("猪八戒");
		array.add("沙和尚");
		array.add("铁扇公主");

		// 不用遍历，直接打印集合
		System.out.println(array);

		// 获取第4个元素（注意，是--第4个元素，它的索引是？）
		System.out.println(array.get(3));

		// 打印一下集合大小
		System.out.println(array.size());

		// 删除元素“铁扇公主”
		// System.out.println("remove:"+array.remove("铁扇公主"));

		// 删除第3个元素（注意：是--第3个元素）
		System.out.println("remove:" + array.remove(3));

		// 将元素“猪八戒”改为“猪悟能”
		System.out.println(array.set(1, "猪悟能"));

		System.out.println(array);

	}
}
