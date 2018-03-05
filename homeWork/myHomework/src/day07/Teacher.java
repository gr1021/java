package day07;

/*
 * teacher类
 */
public class Teacher {

	private String number;
	private String name;
	private char sex;
	private int age;
	private String course;

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

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	// 构造方法
	public Teacher() {

	}

	public Teacher(String number, String name, char sex, int age, String course) {

		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
	}

}
