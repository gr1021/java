package day07_002;

public class Demo {
	
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("����");
		s.setAge(18);
		s.setContent("�������");
		s.eat();
		s.study();
		
		System.out.println("------------------------");
		
		Teacher t = new Teacher("��־��",30,"Java �������������");
		t.eat();
		t.speak();
		
	}

}
