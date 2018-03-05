package day07_005;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p  =new Phone("小米",998);
		p.call();
		p.sendMessage();
		p.playGame();
		System.out.println("---------------------------");
		
		p.setBrand("小米");
		p.setPrice(998);
		p.call();
		p.sendMessage();
		p.playGame();
	}
}
