package Test;

public class CatDemo {
	public static void main(String[] args) {
		Cat c  = new Cat("»¨Ã¨",5);
		
		c.eat();
		c.sleep();
		System.out.println("----------------------");
		c.setAge(5);
		c.setName("»¨Ã¨");
		c.eat();
		c.sleep();
	}
}
