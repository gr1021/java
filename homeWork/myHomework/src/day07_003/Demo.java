package day07_003;

public class Demo {
	public static void main(String[] args) {
		
		//创建对象
		Cat c = new Cat();
		
		c.setBreed("波斯猫");
		c.setColor("花色");
		c.eat();
		c.catchMouse();
		
		System.out.println("------------------------------------");
		Dog d = new Dog("黑色","藏獒");
		d.eat();
		d.lookHome();
	}
}
