package day07_003;

/*
 *  ����: 
 *ë����ɫ color  
 *Ʒ�� breed 
 */
public class Cat {
	private String color;
	private String breed;

	public Cat() {

	}

	public Cat(String color, String breed) {

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

	// �Է� ��ɫ�Ĳ�˹è���ڳ���.....
	public void eat() {
		System.out.println(color + "��" + breed + "���ڳ���.....");
	}

	// ץ���� ��ɫ�Ĳ�˹è���ڴ�����....
	public void catchMouse() {
		System.out.println(color + "��" + breed + "���ڴ�����......");
	}
}
