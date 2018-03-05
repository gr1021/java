package day09_03;

/*
 * 学号	姓名	性别	年龄	身高	
 */
public class Student {
	private String id;
	private String name;
	private String sex;
	private String age;
	private String high;

	public Student() {

	}

	public Student(String id, String name, String sex, String age, String high) {
		
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.high = high;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}
	
	
}
