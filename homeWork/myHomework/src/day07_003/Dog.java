package day07_003;

/*
 * 
 */
public class Dog {

	private String color;
	private String breed;

	public Dog() {

	}

	public Dog(String color, String breed) {

		this.color = color;
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	// �Է� ��ɫ�Ĳ������ڿй�ͷ.....
	public void eat() {
		System.out.println(color + "��" + breed + "���ڿй�ͷ......");
	}

	// ���� ��ɫ�Ĳ������ڿ���.....
	public void lookHome() {
		System.out.println(color + "��" + breed + "���ڿ���......");
	}
}
