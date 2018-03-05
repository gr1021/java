package day07_01;

public class Student {
	
	private String StuNumber;
	private String name;
	private String sex;
	private double high;
	private int age;
	public String getStuNumber() {
		return StuNumber;
	}
	public void setStuNumber(String stuNumber) {
		StuNumber = stuNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Student() {
		
	}
	
	
	public Student(String stuNumber, String name, String sex, double high, int age) {
		super();
		StuNumber = stuNumber;
		this.name = name;
		this.sex = sex;
		this.high = high;
		this.age = age;
	}
	
	
}
