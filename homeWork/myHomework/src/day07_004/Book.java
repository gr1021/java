package day07_004;

/*
 *  �ҳ��۸���ߵ�ͼ�鲢��ӡ��ͼ���������Ϣ��
 */
public class Book {

	private String number;
	private String name;
	private double price;

	public Book() {

	}

	public Book(String number, String name, double price) {

		this.number = number;
		this.name = name;
		this.price = price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {

		this.price = price;
	}

	public void getPriceMax() {
		
	}
	public void print(){
		System.out.println("ͼ���ţ�"+number+"������"+name+"�۸�"+price);
	}
}
