package day07_005;
/*
 *  ����ʹ�ü۸�Ϊ 998 Ԫ��С��Ʒ�Ƶ��ֻ���绰.... 
	����ʹ�ü۸�Ϊ 998 Ԫ��С��Ʒ�Ƶ��ֻ�������.... 
	����ʹ�ü۸�Ϊ 998 Ԫ��С��Ʒ�Ƶ��ֻ�����Ϸ.... 
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


	//��绰 call() 
	public void call(){
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ���绰......");
	}
	
	//������ sendMessage() 
	public void sendMessage(){
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ�������......");
	}
	
	//����Ϸ playGame() 
	public void playGame(){
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ�����Ϸ......");
	}
}
