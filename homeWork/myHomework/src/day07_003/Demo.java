package day07_003;

public class Demo {
	public static void main(String[] args) {
		
		//��������
		Cat c = new Cat();
		
		c.setBreed("��˹è");
		c.setColor("��ɫ");
		c.eat();
		c.catchMouse();
		
		System.out.println("------------------------------------");
		Dog d = new Dog("��ɫ","����");
		d.eat();
		d.lookHome();
	}
}
