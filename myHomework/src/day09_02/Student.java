package day09_02;

/*
 * 1.����Student�࣬�����������ԣ�
 *	ѧ�š����������
 */
public class Student {
	private String id;
	private String name;
	private double high;

	public Student() {

	}

	public Student(String id, String name, double high) {
		this.id = id;
		this.name = name;
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

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

}
