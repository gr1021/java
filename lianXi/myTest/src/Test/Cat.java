package Test;
/*
 * 2.请设计一个猫类，里面名字和年龄等属性，吃饭和睡觉等行为，
 *  设计完成后通过主方法进行测试
 */
public class Cat {
	private String name;
	private int age;
	
	
	
	public Cat() {
		
	}
	
	public Cat(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat(){
		System.out.println("一只大"+name+"正在吃饭");
	}
	public void sleep(){
		System.out.println("一只年龄为"+age+"的大"+name+"正在睡觉");
	}
		
	
}
