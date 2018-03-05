package day07_003;

/*
 *  属性: 
 *毛的颜色 color  
 *品种 breed 
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

	// 吃饭 花色的波斯猫正在吃鱼.....
	public void eat() {
		System.out.println(color + "的" + breed + "正在吃鱼.....");
	}

	// 抓老鼠 花色的波斯猫正在逮老鼠....
	public void catchMouse() {
		System.out.println(color + "的" + breed + "正在逮老鼠......");
	}
}
