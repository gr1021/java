package day09_2_01;

/*
 * ����name		����age     �ɼ�score
 * 
 * �Է�eat()
 stuty(String content)(content:��ʾѧϰ������)

 */
public class Student {
	private String name;
	private String age;
	private int score;

	public void eat() {

	}

	public void study(String content) {

	}
	
	public Student() {

	}

	public Student(String name, String age, int score) {

		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
