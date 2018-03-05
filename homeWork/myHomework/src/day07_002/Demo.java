package day07_002;

public class Demo {
	
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("韩光");
		s.setAge(18);
		s.setContent("面向对象");
		s.eat();
		s.study();
		
		System.out.println("------------------------");
		
		Teacher t = new Teacher("周志鹏",30,"Java 基础中面向对象");
		t.eat();
		t.speak();
		
	}

}
