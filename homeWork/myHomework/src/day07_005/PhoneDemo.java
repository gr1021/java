package day07_005;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p  =new Phone("С��",998);
		p.call();
		p.sendMessage();
		p.playGame();
		System.out.println("---------------------------");
		
		p.setBrand("С��");
		p.setPrice(998);
		p.call();
		p.sendMessage();
		p.playGame();
	}
}
