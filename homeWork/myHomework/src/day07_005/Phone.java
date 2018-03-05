package day07_005;
/*
 *  正在使用价格为 998 元的小米品牌的手机打电话.... 
	正在使用价格为 998 元的小米品牌的手机发短信.... 
	正在使用价格为 998 元的小米品牌的手机玩游戏.... 
 */
public class Phone {
	private String brand;
	private  double price;
	
	public Phone() {
		
	}
	

	public Phone(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	//打电话 call() 
	public void call(){
		System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机打电话......");
	}
	
	//发短信 sendMessage() 
	public void sendMessage(){
		System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机发短信......");
	}
	
	//玩游戏 playGame() 
	public void playGame(){
		System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机玩游戏......");
	}
}
